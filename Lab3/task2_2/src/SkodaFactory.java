public class SkodaFactory implements VehicleFactory {

    @Override
    public Bus createBus() {
        return new BusSkoda(4500000, 25);
    }

    @Override
    public Tramway createTramway() {
        return new TramSkoda(9000000, 8);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new TrolleySkoda(6800000, 12);
    }
}
