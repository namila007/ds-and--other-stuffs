package me.namila.tutorial.pattern.observer.tutorial1.subscriber;

public class AndroidSubscriber implements BaseSubscriber {

    private int id;

    public AndroidSubscriber(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void update(String event) {
        System.out.println("Android Notification Subscriber : "+id+"msg: " +event);
    }
}
