package me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model;

public class Ship extends Vehicle {
    public Ship(){
        System.out.println("creating a ship");
    }

    @Override
    public void move() {
        System.out.println("Sailing in the sea w/ load");
    }
}
