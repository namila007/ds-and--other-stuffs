package me.namila.tutorial.pattern.singleton.tutorial1;

import java.util.concurrent.*;

public class SimpleSingletonApp {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Creating S1");
        Singleton s1 = Singleton.getInstance();
        System.out.println("Creating S2");
        Singleton s2 = Singleton.getInstance();
        System.out.println("IS both S1==S2?: "+s1.equals(s2));



    }
}
