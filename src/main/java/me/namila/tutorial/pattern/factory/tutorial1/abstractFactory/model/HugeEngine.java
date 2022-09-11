package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class HugeEngine implements Engine {
    @Override
    public void buildCustomEngine() {
        System.out.println("building Large v16 engine");
    }
}
