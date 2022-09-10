package me.namila.tutorial.pattern.factory.simple;

import me.namila.tutorial.pattern.factory.model.Vehicle;

public class TransportClient {
    private final VehicleFactory vehicleFactory;
    public TransportClient(VehicleFactory vehicleFactory){
        this.vehicleFactory = vehicleFactory;
    }

    public Vehicle handleVehicle(String vehicleType) {
        Vehicle vehicle = vehicleFactory.getTransport(vehicleType);
        vehicle.build();
        return vehicle;
    }
}
