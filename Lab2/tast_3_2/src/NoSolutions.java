import java.util.ArrayList;

public class NoSolutions  implements Solution{
    private ArrayList<String> solution;

    @Override
    public ArrayList<String> getSolution() {
        this.solution.add("None");
        return this.solution;
    }
}
