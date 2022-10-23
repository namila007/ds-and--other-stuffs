package me.namila.tutorial.pattern.observer.tutorial1.subscriber;

public class SmsSubscriber implements BaseSubscriber {
    private int id;

    public SmsSubscriber(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void update(String event) {
        System.out.println("Sms Subscriber : "+id+ "msg: " + event);
    }
}
