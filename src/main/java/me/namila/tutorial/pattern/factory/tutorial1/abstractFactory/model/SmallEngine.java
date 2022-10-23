package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class SmallEngine implements Engine {
    @Override
    public void buildCustomEngine() {
        System.out.println("building small v4 engine");
    }
}
