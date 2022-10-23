package me.namila.tutorial.pattern.factory.tutorial2.method;

import me.namila.tutorial.pattern.factory.tutorial2.method.factory.ChicagoPizzaStore;
import me.namila.tutorial.pattern.factory.tutorial2.method.factory.NycPizzaStore;
import me.namila.tutorial.pattern.factory.tutorial2.method.factory.PizzaStore;
import me.namila.tutorial.pattern.factory.tutorial2.method.model.Pizza;

// client app
public class PizzaApp {

    public static void main(String[] args) {
        PizzaStore nycPizzaStore = new NycPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza1 = nycPizzaStore.orderPizza("cheese");
        System.out.println("Created pizza: "+pizza1.getName());
        Pizza pizza2 = nycPizzaStore.orderPizza("chicken");
        System.out.println("Created pizza: "+pizza2.getName());

        Pizza pizza3 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Created pizza: "+pizza3.getName());
        Pizza pizza4 = chicagoPizzaStore.orderPizza("chicken");
        System.out.println("Created pizza: "+pizza4.getName());
    }
}
