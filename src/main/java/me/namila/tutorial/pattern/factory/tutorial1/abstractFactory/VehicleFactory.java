package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory;

import me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model.*;


public class VehicleFactory {
    private final EngineFactory landEngineFactory;
    private final EngineFactory seaEngineFactory;
    public VehicleFactory() {
        this.landEngineFactory = new LandEngineFactory();
        this.seaEngineFactory = new SeaEngineFactory();
    }

    public Vehicle getTransport(String type) {
        switch (type) {
            case "car":
                return new Car(landEngineFactory);
            case "ship":
                return new Ship(seaEngineFactory);
            case "truck":
                return new Truck(landEngineFactory);
            case "boat":
                return new Boat(seaEngineFactory);
            default:
                return null;
        }
    }

}
