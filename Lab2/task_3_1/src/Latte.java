public class Latte implements Drink {
    private final int cost;
    private int price;
    private final Double margin;

    public Latte(int cost, Double margin) {
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
