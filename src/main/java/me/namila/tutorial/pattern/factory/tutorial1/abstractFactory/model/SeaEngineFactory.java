package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class SeaEngineFactory implements EngineFactory{
    @Override
    public Engine getEngine(String type) {
        switch (type.toLowerCase()){
            case "small" : return new SmallEngine();
            case "huge" : return new HugeEngine();
            default: return  null;
        }
    }
}
