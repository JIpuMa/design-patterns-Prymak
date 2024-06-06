import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> coeffs_1 = new ArrayList<>();
        coeffs_1.add(4);
        coeffs_1.add(8);
        Equation equation_1 = new Equation(coeffs_1);

        ArrayList<Integer> coeffs_2 = new ArrayList<>();
        coeffs_2.add(4);
        coeffs_2.add(5);
        coeffs_2.add(1);
        QuadraticEquation equation_2 = new QuadraticEquation(coeffs_2);

        ArrayList<Integer> coeffs_3 = new ArrayList<>();
        coeffs_3.add(2);
        coeffs_3.add(0);
        coeffs_3.add(-9);
        coeffs_3.add(0);
        coeffs_3.add(4);
        BiQuadraticEquation equation_3 = new BiQuadraticEquation(coeffs_3);

        System.out.println("Equation 1: " + equation_1);
        System.out.println("Equation 2: " + equation_2);
        System.out.println("Equation 3: " + equation_3);

        Equation equation_clone_1 = equation_1.clone();
        Equation equation_clone_2 = equation_2.clone();
        Equation equation_clone_3 = equation_3.clone();

        System.out.println("Equation 1 Clone: " + equation_clone_1);
        System.out.println("Equation 2 Clone: " + equation_clone_2);
        System.out.println("Equation 3 Clone: " + equation_clone_3);

        System.out.println("Equation 1 Solution: " + equation_1.solve().getSolution());
        System.out.println("Equation 1 Clone Solution: " + equation_clone_1.solve().getSolution());
        System.out.println("Equation 2 Solution: " + equation_2.solve().getSolution());
        System.out.println("Equation 2 Clone Solution: " + equation_clone_2.solve().getSolution());
        System.out.println("Equation 3 Solution: " + equation_3.solve().getSolution());
        System.out.println("Equation 3 Clone Solution: " + equation_clone_3.solve().getSolution());
    }
}