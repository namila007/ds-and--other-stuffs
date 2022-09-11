package me.namila.tutorial.pattern.factory.tutorial1.methodFactory.model;

public class Car extends Vehicle {
    public Car(){
        System.out.println("creating car");
    }

    @Override
    public void move() {
        System.out.println("Driving in the road");

    }
}
