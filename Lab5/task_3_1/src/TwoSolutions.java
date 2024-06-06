import java.util.ArrayList;

public class TwoSolutions implements Solution {
    private float root1 = 0;
    private float root2 = 0;
    private ArrayList<String> solution = new ArrayList<>();

    public TwoSolutions(ArrayList<Float> roots) {
        this.root1 = roots.get(0);
        this.root2 = roots.get(1);
    }

    @Override
    public ArrayList<String> getSolution() {
        this.solution.add(String.valueOf(root1));
        this.solution.add(String.valueOf(root2));
        return this.solution;
    }
}
