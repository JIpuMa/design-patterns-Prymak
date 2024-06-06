import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = readFile("src/input03.txt");
        ArrayList<Solution> solutions = new ArrayList<>();
        ArrayList<Float> solutions_with_one_root = new ArrayList<>();

        for (ArrayList<Integer> parameters : input) {
            if (parameters.size() == 2) {
                Equation eq = new Equation(parameters);
                solutions.add(eq.solve());
            } else if (parameters.size() == 3) {
                QuadraticEquation eq = new QuadraticEquation(parameters);
                solutions.add(eq.solve());
            } else {
                BiQuadraticEquation eq = new BiQuadraticEquation(parameters);
                solutions.add(eq.solve());
            }
        }

        for (Solution result : solutions) {
            if (result instanceof NoSolutions) {
                ArrayList<Integer> value = input.get(solutions.indexOf(result));
                System.out.println("Equation with next coefficients " + value + " has no solution.");
            } else if (result instanceof OneSolution) {
                ArrayList<Integer> value = input.get(solutions.indexOf(result));
                System.out.println("Equation with next coefficients " + value + " has 1 solution.");
                if (!Float.valueOf(result.getSolution().getFirst()).isNaN()) {
                    solutions_with_one_root.add(Float.valueOf(result.getSolution().getFirst()));
                }
            } else if (result instanceof TwoSolutions) {
                ArrayList<Integer> value = input.get(solutions.indexOf(result));
                System.out.println("Equation with next coefficients " + value + " has 2 solutions.");
            } else if (result instanceof ThreeSolutions) {
                ArrayList<Integer> value = input.get(solutions.indexOf(result));
                System.out.println("Equation with next coefficients " + value + " has 3 solutions.");
            } else if (result instanceof FourSolutions) {
                ArrayList<Integer> value = input.get(solutions.indexOf(result));
                System.out.println("Equation with next coefficients " + value + " has 4 solutions.");
            }
        }

        System.out.println("\nThe smallest root of equations with one solution is " + Collections.min(solutions_with_one_root));
        System.out.println("The biggest root of equations with one solution is " + Collections.max(solutions_with_one_root));
    }

    private static ArrayList<ArrayList<Integer>> readFile(String file_name) {
        ArrayList<ArrayList<Integer>> formatted_input = new ArrayList<>();
        try {
            File f = new File(file_name);
            FileReader fr = new FileReader(f);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while (line != null) {
                String clear_line = line.trim().replaceAll(" +", " ");
                List<String> string_numbers = List.of(clear_line.split(" "));
                ArrayList<Integer> integer_numbers = new ArrayList<>();
                if (Objects.equals(string_numbers.getFirst(), "")) {
                    break;
                }
                for (String sn : string_numbers) {
                    integer_numbers.add(Integer.valueOf(sn));
                }
                formatted_input.add(integer_numbers);
                line = reader.readLine();
            }

            reader.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();;
        }

        return formatted_input;
    }
}