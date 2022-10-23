package me.namila.tutorial.pattern.factory.tutorial1.abstractFactory.model;

public class LandEngineFactory implements EngineFactory{
    @Override
    public Engine getEngine(String type) {
        switch (type.toLowerCase()){
            case "small" : return new SmallEngine();
            case "large" : return new LargeEngine();
            default: return  null;
        }
    }
}
