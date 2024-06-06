import java.util.List;

public class Equation implements Cloneable {
    private final List<Integer> coefficients;

    public Equation(List<Integer> coefficients) {
        this.coefficients = coefficients;
    }

    public Equation(Equation equation) {
        this.coefficients = equation.coefficients;
    }

    public Solution solve() {
        Integer c = coefficients.get(1);
        Integer b = coefficients.get(0);
        if (b == 0) {
            return new NoSolutions();
        } else {
            float answer = ((float) (-c) / b);
            return new OneSolution(answer);
        }
    }

    @Override
    public Equation clone() {
        return new Equation(this);
    }

    @Override
    public String toString() {
        return coefficients.toString();
    }
}
