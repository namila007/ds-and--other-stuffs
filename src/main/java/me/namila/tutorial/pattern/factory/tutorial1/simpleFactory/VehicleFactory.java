package me.namila.tutorial.pattern.factory.tutorial1.simpleFactory;

import me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model.Car;
import me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model.Ship;
import me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model.Vehicle;

public class VehicleFactory {

    public VehicleFactory() {
    }

    public Vehicle getTransport(String type) {
        switch (type) {
            case "car":
                return new Car();
            case "ship":
                return new Ship();
            default:
                return null;
        }
    }
}
