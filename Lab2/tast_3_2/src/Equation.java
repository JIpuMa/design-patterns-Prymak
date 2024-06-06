import java.util.List;

public class Equation {
    private final List<Integer> coefficients;

    public Equation(List<Integer> coefficients) {
        this.coefficients = coefficients;
    }

    public Solution solve() {
        Integer c = coefficients.get(1);
        Integer b = coefficients.get(0);
        if (b == 0) {
            return new NoSolutions();
        }
        else {
            float answer = ((float) (-c) / b);
            return new OneSolution(answer);
        }
    }
}
