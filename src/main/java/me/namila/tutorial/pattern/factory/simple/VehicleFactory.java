package me.namila.tutorial.pattern.factory.simple;

import me.namila.tutorial.pattern.factory.model.Car;
import me.namila.tutorial.pattern.factory.model.Ship;
import me.namila.tutorial.pattern.factory.model.Vehicle;

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
