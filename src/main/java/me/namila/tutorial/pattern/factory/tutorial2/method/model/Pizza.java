package me.namila.tutorial.pattern.factory.tutorial2.method.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//product abstract
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("preparing pizza: "+name);
        System.out.println("adding dough: "+dough);
        System.out.println("adding sauce: "+sauce);
        System.out.println("Adding toppings: "+ Arrays.asList(toppings).toString());
    }

    public void cut () {
        System.out.println("cutting into diagonal slices");
    }
    public String getName() {
        return name;
    }
}
