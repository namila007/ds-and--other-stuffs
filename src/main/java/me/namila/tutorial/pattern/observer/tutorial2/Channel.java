package me.namila.tutorial.pattern.observer.tutorial2;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> observers;
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        observers = new ArrayList<>();
        this.channelName = channelName;
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(status));
    }

    public String getChannelName() {
        return channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }
}
