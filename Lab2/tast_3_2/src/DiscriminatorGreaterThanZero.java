import java.util.ArrayList;

public class DiscriminatorGreaterThanZero implements Discriminator {
    private final ArrayList<Float> roots = new ArrayList<>();

    public DiscriminatorGreaterThanZero(int a, int b, int D) {
        float root1 = ((float) ((-b + Math.sqrt(D))) / (2 * a));
        float root2 = ((float) ((-b - Math.sqrt(D))) / (2 * a));
        this.roots.add(root1);
        this.roots.add(root2);
    }

    public ArrayList<Float> getRoots() {
        return this.roots;
    }
}
