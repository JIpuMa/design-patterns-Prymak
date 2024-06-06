public class Cappuccino implements Drink {
    private final int cost;
    private int price;
    private final Double margin;

    public Cappuccino(int cost, Double hot_coffee_margin) {
        this.cost = cost;
        this.margin = hot_coffee_margin;
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
