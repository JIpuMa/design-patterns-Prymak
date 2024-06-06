public class HyundaiFactory implements VehicleFactory {

    @Override
    public Bus createBus() {
        return new BusHyundai(5500000, 20);
    }

    @Override
    public Tramway createTramway() {
        return new TramHyundai(9500000, 6);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new TrolleyHyundai(7000000, 11);
    }
}
