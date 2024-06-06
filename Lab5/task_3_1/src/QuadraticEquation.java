import java.util.List;

public class QuadraticEquation extends Equation{
    private final DiscriminatorCalculation dis_result = new DiscriminatorCalculation();
    private final List<Integer> coefficients;

    public QuadraticEquation(List<Integer> coefficients) {
        super(coefficients);
        this.coefficients = coefficients;
    }

    public QuadraticEquation(QuadraticEquation equation) {
        super(equation);
        this.coefficients = equation.coefficients;
    }

    @Override
    public Solution solve() {
        Integer c = coefficients.get(2);
        Integer b = coefficients.get(1);
        Integer a = coefficients.get(0);
        Discriminator D = dis_result.calcD(a, b, c);
        if (D instanceof DiscriminatorGreaterThanZero) {
            return new TwoSolutions(((DiscriminatorGreaterThanZero) D).getRoots());
        } else if (D instanceof DiscriminatorEqualsZero) {
            return new OneSolution(((DiscriminatorEqualsZero) D).getRoots());
        } else {
            return new NoSolutions();
        }
    }

    @Override
    public QuadraticEquation clone() {
        return new QuadraticEquation(this);
    }
}
