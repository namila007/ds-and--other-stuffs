package me.namila.tutorial.pattern.factory.model;

public class Car implements Vehicle{
    public Car(){
        System.out.println("creating car");
    }

    @Override
    public void move() {
        System.out.println("Driving in the road");

    }

    @Override
    public void build() {
        System.out.println("building a Car with features");
    }
}
