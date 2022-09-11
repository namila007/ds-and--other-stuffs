package me.namila.tutorial.pattern.factory.tutorial1.simpleFactory;

import me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model.Vehicle;

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
