package me.namila.tutorial.pattern.factory.tutorial2.method.factory;

import me.namila.tutorial.pattern.factory.tutorial2.method.model.Pizza;

// abstract creator
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type); // subclass impl the concrete classes

    public Pizza orderPizza(String type){
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.cut();
        return pizza;
    }
}
