package me.namila.tutorial.pattern.factory.simple;

import me.namila.tutorial.pattern.factory.model.Vehicle;

public class App {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        TransportClient client = new TransportClient(vehicleFactory);

        Vehicle car = client.handleVehicle("car");
        Vehicle ship = client.handleVehicle("ship");
        car.move();
        ship.move();
    }
}
