package me.namila.tutorial.pattern.observer.tutorial2;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
