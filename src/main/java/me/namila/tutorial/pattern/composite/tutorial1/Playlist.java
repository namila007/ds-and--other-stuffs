package me.namila.tutorial.pattern.composite.tutorial1;

import java.util.ArrayList;

public class Playlist implements IComponent{

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void remove(IComponent iComponent) {
        this.playlist.remove(iComponent);
    }

    public void add(IComponent iComponent) {
        this.playlist.add(iComponent);
    }

    @Override
    public void play() {
        playlist.forEach(IComponent::play);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        playlist.forEach(song -> song.setPlaybackSpeed(speed));
    }

    @Override
    public String getName() {
        return playlistName;
    }
}
