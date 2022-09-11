package me.namila.tutorial.pattern.factory.tutorial1.methodFactory;

import me.namila.tutorial.pattern.factory.tutorial1.methodFactory.model.Car;
import me.namila.tutorial.pattern.factory.tutorial1.methodFactory.model.Truck;
import me.namila.tutorial.pattern.factory.tutorial1.methodFactory.model.Vehicle;

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
