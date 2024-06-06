import java.util.ArrayList;

public abstract class Store {
    public abstract Drink orderDrink(DrinkType type);

    public int calcTotalCost(ArrayList<Drink> drinks) {
        int totalCost = 0;
        for (Drink drink : drinks) {
            totalCost += drink.getCost();
        }
        return totalCost;
    }

    public int calcTotalPrice(ArrayList<Drink> drinks) {
        int totalPrice = 0;
        for (Drink drink : drinks) {
            totalPrice += drink.getPrice();
        }
        return totalPrice;
    }

    public int calcProfit(int costs, int prices) {
        return prices-costs;
    }
}
