package me.namila.tutorial.pattern.observer.tutorial2;

public class Follower implements Observer {

    private String followerName;

    @Override
    public void update(String value) {
        this.followerName = value;
    }

    public void play() {
        System.out.println("playing follower: " + followerName);
    }
}
