public class TrolleyHyundai implements Trolleybus {
    private final Integer vehicle_cost;
    private final Integer cost_per_km;

    public TrolleyHyundai(Integer vehicleCost, Integer costPerKm) {
        this.vehicle_cost = vehicleCost;
        this.cost_per_km = costPerKm;
    }

    @Override
    public Integer getVehicleCost() {
        return this.vehicle_cost;
    }

    @Override
    public Integer getCostPerKm(Integer distance) {
        return this.cost_per_km * distance;
    }
}
