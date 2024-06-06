import java.util.ArrayList;

public class OneSolution implements Solution {
    private final float root;
    private ArrayList<String> solution = new ArrayList<>();

    public OneSolution(float root) {
        this.root = root;
    }

    @Override
    public ArrayList<String> getSolution() {
        this.solution.add(String.valueOf(root));
        return this.solution;
    }
}
