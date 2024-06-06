public class CarBuilder {
    public Car buildCar(String brand, int power, int radius) {
        Engine engine = new Engine(power);
        Wheel wheel = new Wheel(radius);
        return new Car(brand, engine, wheel);
    }
}
