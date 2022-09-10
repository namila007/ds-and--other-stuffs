package me.namila.tutorial.pattern.factory.model;

public class Boat implements Vehicle{
    public Boat(){
        System.out.println("creating a boar");
    }

    @Override
    public void move() {
        System.out.println("Sailing in the sea");
    }

    @Override
    public void build() {
        System.out.println("building a Boat with features");
    }

}
