public class Car {
    private String brand;
    private final Engine engine;
    private final Wheel wheel;

    public Car(String brand, Engine engine, Wheel wheel) {
        this.brand = brand;
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
