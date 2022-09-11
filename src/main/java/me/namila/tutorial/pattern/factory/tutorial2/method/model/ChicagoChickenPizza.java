package me.namila.tutorial.pattern.factory.tutorial2.method.model;



public class ChicagoChickenPizza extends Pizza{
    public ChicagoChickenPizza(){
        this.name="ChicagoChickenPizza";
        this.dough = "chicago dough2";
        this.sauce = "chilli";
        this.toppings.add("pepperoni");

    }

    @Override
    public void cut() {
        System.out.println("cut into square");
    }
}
