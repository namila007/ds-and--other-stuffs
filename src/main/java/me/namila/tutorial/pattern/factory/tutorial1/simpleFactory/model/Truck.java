package me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model;

public class Truck extends Vehicle {
    public Truck(){
        System.out.println("creating a truck");
    }

    @Override
    public void move() {
        System.out.println("Driving in the road with load");
    }

}
