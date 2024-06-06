import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation{
    private final DiscriminatorCalculation dis_result = new DiscriminatorCalculation();
    private final List<Integer> coefficients;

    public BiQuadraticEquation(List<Integer> coefficients) {
        super(coefficients);
        this.coefficients = coefficients;
    }

    @Override
    public Solution solve() {
        Integer c = coefficients.get(2);
        Integer b = coefficients.get(1);
        Integer a = coefficients.get(0);
        Discriminator D = dis_result.calcD(a, b, c);

        if (D instanceof DiscriminatorGreaterThanZero) {
            ArrayList<Float> roots = ((DiscriminatorGreaterThanZero) D).getRoots();
            ArrayList<Float> new_roots = new ArrayList<>();
            boolean is_three_roots = false;

            for (Float root : roots) {
                if (root == (float) 0) {
                    new_roots.add((float) 0);
                    is_three_roots = true;
                } else {
                    float new_root1 = (float) Math.sqrt(root);
                    float new_root2 = (float) -Math.sqrt(root);
                    new_roots.add(new_root1);
                    new_roots.add(new_root2);
                }
            }

            if (is_three_roots) {
                return new ThreeSolutions(new_roots);
            } else {
                return new FourSolutions(new_roots);
            }

        } else if (D instanceof DiscriminatorEqualsZero) {
            float root = ((DiscriminatorEqualsZero) D).getRoots();
            ArrayList<Float> new_roots = new ArrayList<>();

            float new_root1 = (float) Math.sqrt(root);
            float new_root2 = (float) -Math.sqrt(root);

            new_roots.add(new_root1);
            new_roots.add(new_root2);

            return new TwoSolutions(new_roots);

        } else {
            return new NoSolutions();
        }
    }
}
