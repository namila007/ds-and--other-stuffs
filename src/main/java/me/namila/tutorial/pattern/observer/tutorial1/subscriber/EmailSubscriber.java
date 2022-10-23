package me.namila.tutorial.pattern.observer.tutorial1.subscriber;

public class EmailSubscriber implements BaseSubscriber{
    private int id;

    public EmailSubscriber(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void update(String event) {
        System.out.println("EMail Subscriber : "+id+"msg: " +event);
    }
}
