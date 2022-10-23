package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class Ship implements Vehicle {
    private EngineFactory engineFactory;

    public Ship(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
        System.out.println("creating a ship");
    }

    private Engine engine;

    @Override
    public void move() {
        System.out.println("Sailing in the sea w/ load");
    }

    @Override
    public void build() {
        buildEngine();
        System.out.println("ship built");
    }

    @Override
    public void buildEngine() {
        engine = engineFactory.getEngine("huge");
        engine.buildCustomEngine();
    }
}
