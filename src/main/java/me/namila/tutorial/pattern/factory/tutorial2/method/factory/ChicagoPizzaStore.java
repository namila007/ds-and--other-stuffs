package me.namila.tutorial.pattern.factory.tutorial2.method.factory;

import me.namila.tutorial.pattern.factory.tutorial2.method.model.ChicagoCheesePizza;
import me.namila.tutorial.pattern.factory.tutorial2.method.model.ChicagoChickenPizza;
import me.namila.tutorial.pattern.factory.tutorial2.method.model.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        switch (type.toLowerCase()){
            case "cheese": return new ChicagoCheesePizza();
            case "chicken": return new ChicagoChickenPizza();
            default: return null;
        }
    }
}
