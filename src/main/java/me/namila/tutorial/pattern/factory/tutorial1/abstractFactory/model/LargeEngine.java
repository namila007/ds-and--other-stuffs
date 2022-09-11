package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class LargeEngine implements Engine {
    @Override
    public void buildCustomEngine() {
        System.out.println("building Large v8 engine");
    }
}
