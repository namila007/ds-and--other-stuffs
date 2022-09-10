package me.namila.tutorial.pattern.singleton.tutorial1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadUnsafeSingletonApp {

    /*
    in here we failed the singleton when initiate in parallel
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<Singleton>> callableList = new ArrayList<>();
        for(int i=0;i<1000;i++) {
            callableList.add(() -> {
//                System.out.println("executing : "+Thread.currentThread());
                return Singleton.getInstance();
            });
        }

        List<Future<Singleton>> futureList = new ArrayList<>();
        callableList.forEach(call-> {
            futureList.add(executorService.submit(call));
        });
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        Singleton as1 = null;
        Singleton as2 = null;
        if(futureList.get(0).isDone())as1=futureList.get(0).get();
        if(futureList.get(800).isDone())as2=futureList.get(800).get();
        System.out.println(as1);
        System.out.println(as2);
        System.out.println("IS both AS1==AS2?: "+as1.equals(as2));
    }
}
