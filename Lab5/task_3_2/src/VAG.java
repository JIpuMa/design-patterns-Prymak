public class VAG {

    Car createAudi() {
        Engine.EngineBuilder engineBuilder = new Engine.EngineBuilder();
        engineBuilder
                .setPower(483);
        Engine engine = engineBuilder.build();

        Wheel.WheelBuilder wheelBuilder = new Wheel.WheelBuilder();
        wheelBuilder
                .setDiameter(21);
        Wheel wheel = wheelBuilder.build();

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carBuilder
                .setWheel(wheel)
                .setEngine(engine)
                .setCarColor(Car.CarColor.Black);
        Car car = carBuilder.build();
        return car;
    }

    Car createSkoda() {
        Engine.EngineBuilder engineBuilder = new Engine.EngineBuilder();
        engineBuilder
                .setPower(200)
                .setFuel(Engine.Fuel.Diesel);
        Engine engine = engineBuilder.build();

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carBuilder
                .setEngine(engine)
                .setType(Car.Type.SUV)
                .setCarColor(Car.CarColor.Grey);
        Car car = carBuilder.build();
        return car;
    }

    Car createSiat() {
        Wheel.WheelBuilder wheelBuilder = new Wheel.WheelBuilder();
        wheelBuilder
                .setDiameter(11)
                .setMaterial(Wheel.Material.Forged);
        Wheel wheel = wheelBuilder.build();

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carBuilder
                .setWheel(wheel)
                .setType(Car.Type.Hatchback)
                .setCarColor(Car.CarColor.Red);
        Car car = carBuilder.build();
        return car;
    }
}
