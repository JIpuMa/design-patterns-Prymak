public class StoreHotCoffee extends Store{
    final int americano_cost = 45;
    final int cappuccino_cost = 55;
    final int espresso_cost = 30;
    final int latte_cost = 50;
    final Double hot_coffee_margin = 0.5;

    @Override
    public Drink orderDrink(DrinkType type) {
        Drink drink = null;
        switch (type) {
            case AMERICANO -> drink = new Americano(americano_cost, hot_coffee_margin);
            case CAPPUCCINO -> drink = new Cappuccino(cappuccino_cost, hot_coffee_margin);
            case ESPRESSO -> drink = new Espresso(espresso_cost, hot_coffee_margin);
            case LATTE -> drink = new Latte(latte_cost, hot_coffee_margin);
        }
        return drink;
    }
}
