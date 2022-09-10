package me.namila.tutorial.pattern.factory.model;

public class Truck implements Vehicle{
    public Truck(){
        System.out.println("creating a truck");
    }

    @Override
    public void move() {
        System.out.println("Driving in the road with load");
    }

    @Override
    public void build() {
        System.out.println("building a truck");
    }
}
