package me.namila.tutorial.pattern.singleton.tutorial1;

public class Singleton {

    private static Singleton singletonInstance = null;

    private Singleton() {
        System.out.println("creating singleton object");
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
            return singletonInstance;
        }
        return singletonInstance;
    }
}
