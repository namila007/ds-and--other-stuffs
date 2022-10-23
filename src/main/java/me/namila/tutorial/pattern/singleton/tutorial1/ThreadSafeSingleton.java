package me.namila.tutorial.pattern.singleton.tutorial1;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton() {
        System.out.println("Initiating thread safe instance:" + Thread.currentThread());
    }

    public static ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            // class level lock
            synchronized (ThreadSafeSingleton.class) {
                if (threadSafeSingleton == null) {
                    threadSafeSingleton = new ThreadSafeSingleton();
                    return threadSafeSingleton;
                }
            }
        }
        return threadSafeSingleton;
    }
}
