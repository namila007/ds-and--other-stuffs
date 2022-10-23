package me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model;

public class Boat extends Vehicle {
    public Boat(){
        System.out.println("creating a boar");
    }

    @Override
    public void move() {
        System.out.println("Sailing in the sea");
    }


}
