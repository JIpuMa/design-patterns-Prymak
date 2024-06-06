import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StoreHotCoffee storeHotCoffee = new StoreHotCoffee();

        Drink hot_order1 = storeHotCoffee.orderDrink(DrinkType.CAPPUCCINO);
        Drink hot_order2 = storeHotCoffee.orderDrink(DrinkType.ESPRESSO);
        Drink hot_order3 = storeHotCoffee.orderDrink(DrinkType.ESPRESSO);
        Drink hot_order4 = storeHotCoffee.orderDrink(DrinkType.AMERICANO);

        ArrayList<Drink> hot_drinks = new ArrayList<>();
        Collections.addAll(hot_drinks, hot_order1, hot_order2, hot_order3, hot_order4);

        StoreIceCoffee storeIceCoffee = new StoreIceCoffee();

        Drink cold_order1 = storeIceCoffee.orderDrink(DrinkType.ESPRESSO_TONIC);
        Drink cold_order2 = storeIceCoffee.orderDrink(DrinkType.ESPRESSO_TONIC);
        Drink cold_order3 = storeIceCoffee.orderDrink(DrinkType.ICE_LATTE);
        Drink cold_order4 = storeIceCoffee.orderDrink(DrinkType.ICE_LATTE);

        ArrayList<Drink> ice_drinks = new ArrayList<>();
        Collections.addAll(ice_drinks, cold_order1, cold_order2, cold_order3, cold_order4);

        int hot_drink_cost = calcCost(storeHotCoffee, hot_drinks);
        int hot_drink_price = calcPrice(storeHotCoffee, hot_drinks);
        int hot_drink_profit = calcProfit(storeHotCoffee, hot_drink_cost, hot_drink_price);

        int cold_drink_cost = calcCost(storeIceCoffee, ice_drinks);
        int cold_drink_price = calcPrice(storeIceCoffee, ice_drinks);
        int cold_drink_profit = calcProfit(storeIceCoffee, cold_drink_cost, cold_drink_price);

        System.out.printf("Profit: %s", hot_drink_profit + cold_drink_profit);

    }

    private static int calcCost(Store storeType, ArrayList<Drink> drinks) {
        return storeType.calcTotalCost(drinks);
    }

    private static int calcPrice (Store storeType, ArrayList<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.calculatePrice();
        }
        return storeType.calcTotalPrice(drinks);
    }

    public static int calcProfit (Store storeType, int costs, int prices) {
        return storeType.calcProfit(costs, prices);
    }
}