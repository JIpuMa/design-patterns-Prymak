public class StoreIceCoffee extends Store{
    final int cold_cappuccino_cost = 40;
    final int espresso_tonic_cost = 45;
    final int ice_latte_cost = 35;
    final Double cold_coffee_margin = 1.5;

    @Override
    public Drink orderDrink(DrinkType type) {
        Drink drink = null;
        switch (type) {
            case COLD_CAPPUCCINO -> drink = new ColdCappuccino(cold_cappuccino_cost, cold_coffee_margin);
            case ESPRESSO_TONIC -> drink = new EspressoTonic(espresso_tonic_cost, cold_coffee_margin);
            case ICE_LATTE -> drink = new IceLatte(ice_latte_cost, cold_coffee_margin);
        }
        return drink;
    }
}
