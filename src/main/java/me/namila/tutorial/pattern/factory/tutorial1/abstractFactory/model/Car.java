package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class Car implements Vehicle {
    private EngineFactory engineFactory;

    public Car(EngineFactory engineFactory) {
        this.engineFactory = engineFactory;
        System.out.println("creating car");
    }

    private Engine engine;

    @Override
    public void move() {
        System.out.println("Driving in the road");

    }

    @Override
    public void build() {
        buildEngine();
        System.out.println("car built");
    }

    @Override
    public void buildEngine() {
        engine = engineFactory.getEngine("small");
        engine.buildCustomEngine();
    }
}
