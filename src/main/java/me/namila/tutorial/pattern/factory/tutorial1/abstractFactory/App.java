package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory;

import me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model.Vehicle;

public class App {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory1 = new VehicleFactory();
        TransportClient transportClient= new TransportClient(vehicleFactory1);
        Vehicle car = transportClient.handleVehicle("car");
        Vehicle truck = transportClient.handleVehicle("truck");
        Vehicle ship = transportClient.handleVehicle("ship");
        Vehicle boat = transportClient.handleVehicle("boat");
    }
}
