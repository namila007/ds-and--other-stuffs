package me.namila.tutorial.pattern.factory.method;

import me.namila.tutorial.pattern.factory.model.Vehicle;

public class ClientApp {

    public static void main(String[] args) {
        Vehicle v1 = new LandVehicleFactory().handleVehicle("car");
        Vehicle v2 = new SeaVehicleFactory().handleVehicle("boat");
    }


}
