package me.namila.tutorial.pattern.factory.tutorial2.method.factory;

import me.namila.tutorial.pattern.factory.tutorial2.method.model.NycCheesePizza;
import me.namila.tutorial.pattern.factory.tutorial2.method.model.NycChickenPizza;
import me.namila.tutorial.pattern.factory.tutorial2.method.model.Pizza;

public class NycPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        switch (type.toLowerCase()){
            case "cheese": return new NycCheesePizza();
            case "chicken": return new NycChickenPizza();
            default: return null;
        }
    }
}
