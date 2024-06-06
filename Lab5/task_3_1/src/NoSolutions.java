import java.util.ArrayList;

public class NoSolutions  implements Solution{
    private ArrayList<String> solution = new ArrayList<>();

    @Override
    public ArrayList<String> getSolution() {
        this.solution.add("None");
        return this.solution;
    }
}
