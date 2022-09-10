package me.namila.tutorial.pattern.factory.method;

import me.namila.tutorial.pattern.factory.model.Car;
import me.namila.tutorial.pattern.factory.model.Truck;
import me.namila.tutorial.pattern.factory.model.Vehicle;

public class SeaVehicleFactory extends VehicleFactory {
    @Override
    protected Vehicle getVehicle(String type) {
        switch (type.toLowerCase()) {
            case "ship":
                return new Car();
            case "boat":
                return new Truck();
            default:
                return null;
        }
    }
}
