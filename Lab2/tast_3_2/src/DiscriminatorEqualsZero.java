public class DiscriminatorEqualsZero implements Discriminator {
    private final float root;

    public DiscriminatorEqualsZero(int a, int b) {
        this.root = (float) -b / (2 * a);;
    }

    public float getRoots() {
        return this.root;
    }
}
