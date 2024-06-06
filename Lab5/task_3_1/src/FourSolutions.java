import java.util.ArrayList;

public class FourSolutions implements Solution {
    private final float root1;
    private final float root2;
    private final float root3;
    private final float root4;
    private ArrayList<String> solution = new ArrayList<>();

    public FourSolutions(ArrayList<Float> roots) {
        this.root1 = roots.get(0);
        this.root2 = roots.get(1);
        this.root3 = roots.get(2);
        this.root4 = roots.get(3);
    }

    @Override
    public ArrayList<String> getSolution() {
        this.solution.add(String.valueOf(root1));
        this.solution.add(String.valueOf(root2));
        this.solution.add(String.valueOf(root3));
        this.solution.add(String.valueOf(root4));
        return this.solution;
    }
}
