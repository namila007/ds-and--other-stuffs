package me.namila.tutorial.pattern.factory.tutorial2.method.model;



public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza(){
        this.name="ChicagoCheesePizza";
        this.dough = "thin crust";
        this.sauce = "";
        this.toppings.add("cheese");

    }

    @Override
    public void cut() {
        System.out.println("cut into square");
    }
}
