package me.namila.tutorial.pattern.observer.tutorial1.subscriber;

public interface BaseSubscriber {

    int getId();
    void update(String event);
}
