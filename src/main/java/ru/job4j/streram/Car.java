package ru.job4j.streram;

public class Car {
    private byte wheels;
    private String engine;
    private String transmission;
    private String steering;
    private String carBody;
    private String suspension;
    private String exhaust;

    static class Builder {
        private byte wheels;
        private String engine;
        private String transmission;
        private String steering;
        private String carBody;
        private String suspension;
        private String exhaust;

        Builder builderWheels(byte wheels) {
            this.wheels = wheels;
            return this;
        }

        Builder builderEngine(String engine) {
            this.engine = engine;
            return this;
        }

        Builder builderTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        Builder builderSteering(String steering) {
            this.steering = steering;
            return this;
        }

        Builder builderCarBody(String carBody) {
            this.carBody = carBody;
            return this;
        }

        Builder builderSuspension(String suspension) {
            this.suspension = suspension;
            return this;
        }

        Builder builderExhaust(String exhaust) {
            this.exhaust = exhaust;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.carBody = carBody;
            car.engine = engine;
            car.exhaust = exhaust;
            car.steering = steering;
            car.suspension = suspension;
            car.wheels = wheels;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "wheels=" + wheels
                + ", engine='" + engine + '\''
                + ", transmission='" + transmission + '\''
                + ", steering='" + steering + '\''
                + ", carBody='" + carBody + '\''
                + ", suspension='" + suspension + '\''
                + ", exhaust='" + exhaust + '\''
                + '}';
    }

    public static void main(String[] args) {
        Car car = new Builder().builderCarBody("Car Body")
                .builderEngine("Engine")
                .builderTransmission("transmission")
                .builderExhaust("Exhaust")
                .builderSteering("Steering")
                .builderWheels((byte) 4)
                .builderSuspension("Suspension")
                .build();
        System.out.println(car);
    }
}
