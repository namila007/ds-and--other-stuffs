package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class Truck implements Vehicle {
    private Engine engine;
    private EngineFactory engineFactory;
    public Truck(EngineFactory engineFactory ){
        this.engineFactory =engineFactory;
        System.out.println("creating a truck");
    }

    @Override
    public void move() {
        System.out.println("Driving in the road with load");
    }

    @Override
    public void build() {
        buildEngine();
        System.out.println("truck built");
    }

    @Override
    public void buildEngine() {
        engine= engineFactory.getEngine("large");
        engine.buildCustomEngine();
    }
}
