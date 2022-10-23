package me.namila.tutorial.pattern.factory.tutorial2.method.model;



public class NycCheesePizza extends Pizza{
    public NycCheesePizza(){
        this.name="NYC Cheese Pizza";
        this.dough = "nyc dough";
        this.sauce = "tomato";
        this.toppings.add("pepperoni");
        this.toppings.add("chillies");

    }
}
