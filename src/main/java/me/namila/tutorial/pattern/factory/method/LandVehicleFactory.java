package me.namila.tutorial.pattern.factory.method;

import me.namila.tutorial.pattern.factory.model.Car;
import me.namila.tutorial.pattern.factory.model.Truck;
import me.namila.tutorial.pattern.factory.model.Vehicle;

public class LandVehicleFactory extends VehicleFactory {
    @Override
    protected Vehicle getVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            default:
                return null;
        }
    }
}
