public class ColdCappuccino implements Drink {
    private final int cost;
    private int price;
    private final Double margin;

    public ColdCappuccino(int cost, Double margin) {
        this.cost = cost;
        this.margin = margin;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void calculatePrice() {
        price = (int) Math.ceil(this.cost * (1 + this.margin));
    }
}
