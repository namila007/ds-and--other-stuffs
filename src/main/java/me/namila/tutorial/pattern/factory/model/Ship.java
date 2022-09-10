package me.namila.tutorial.pattern.factory.model;

public class Ship implements Vehicle{
    public Ship(){
        System.out.println("creating a ship");
    }

    @Override
    public void move() {
        System.out.println("Sailing in the sea w/ load");
    }
    @Override
    public void build() {
        System.out.println("building a ship with features");
    }
}
