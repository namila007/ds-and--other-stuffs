package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class Boat implements Vehicle {
    private EngineFactory engineFactory;
    public Boat(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
        System.out.println("creating a boat");
    }

    private Engine engine;

    @Override
    public void move() {
        System.out.println("Sailing in the sea");
    }

    @Override
    public void build() {
        buildEngine();
        System.out.println("boat built");
    }

    @Override
    public void buildEngine() {
        engine = engineFactory.getEngine("small");
        engine.buildCustomEngine();
    }

}
