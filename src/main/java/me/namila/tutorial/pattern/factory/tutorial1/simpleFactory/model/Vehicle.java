package me.namila.tutorial.pattern.factory.tutorial1.simpleFactory.model;

public abstract class Vehicle {
    public abstract void move();

    public void build() {
        System.out.println("building a vehicle in factory");
    };
}
