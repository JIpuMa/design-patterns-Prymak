public class Car implements Cloneable{

    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey    //  Сірий
    }

    public enum Type {  //  Тип кузову автомобіля
        Sedan,      //  Седан
        Hatchback,  //  Хетчбек
        SUV         //  Кросовер
    }

    public static class CarBuilder {
        private Type type = Type.Sedan;
        public CarBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        private CarColor carColor = CarColor.White;
        public CarBuilder setCarColor(CarColor carColor) {
            this.carColor = carColor;
            return this;
        }

        private Engine engine = (new Engine.EngineBuilder()).build();
        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        private Wheel wheel = (new Wheel.WheelBuilder()).build();
        public CarBuilder setWheel(Wheel wheel) {
            this.wheel = wheel;
            return this;
        }

        public Car build() {
            return new Car(type, carColor, engine, wheel);
        }
    }

    final private Type type;          //  Тип кузову
    final private CarColor carColor;  //  Колір
    final private Engine engine;      //  Двигун
    final private Wheel wheel;        //  Колеса

    public Car(Type type, CarColor carColor,
               Engine engine, Wheel wheel) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car(Car other) {
        this.type = other.type;
        this.carColor = other.carColor;
        this.engine = other.engine;
        this.wheel = other.wheel;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\nwheel=" + wheel +
                '\n';
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}