public class CarSimulator {
    private Car car;
    private CarBuilder carBuilder;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();
    }

    public void buildCar(String brand, int power, int radius) {
        this.car = carBuilder.buildCar(brand, power, radius);
    }
}
