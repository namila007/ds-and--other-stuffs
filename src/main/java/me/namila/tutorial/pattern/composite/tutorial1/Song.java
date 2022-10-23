package me.namila.tutorial.pattern.composite.tutorial1;

public class Song implements IComponent{
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public void play() {
        System.out.println("playing song: "+songName+ " by: "+artist + "at speed of: "+ speed);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return songName;
    }
}
