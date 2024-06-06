public class VolvoFactory implements VehicleFactory {

    @Override
    public Bus createBus() {
        return new BusVolvo(6000000, 20);
    }

    @Override
    public Tramway createTramway() {
        return new TramVolvo(10000000, 7);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new TrolleyVolvo(7000000, 13);
    }
}
