package me.namila.tutorial.pattern.factory.tutorial1.methodFactory;

import me.namila.tutorial.pattern.factory.tutorial1.methodFactory.model.Vehicle;

public abstract class VehicleFactory {

    protected abstract Vehicle getVehicle(String type);

    public Vehicle handleVehicle(String type) {
        Vehicle vehicle = getVehicle(type);
        vehicle.build();
        vehicle.move();
        return vehicle;
    }
}
