package me.namila.tutorial.pattern.factory.tutorial1.methodFactory;

import me.namila.tutorial.pattern.factory.tutorial1.methodFactory.model.Vehicle;

public class ClientApp {

    public static void main(String[] args) {
        Vehicle v1 = new LandVehicleFactory().handleVehicle("car");
        Vehicle v2 = new SeaVehicleFactory().handleVehicle("boat");
    }


}
