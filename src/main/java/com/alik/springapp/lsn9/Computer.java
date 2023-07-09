package com.alik.springapp.lsn9;

//@Component

public class Computer {
    int id;
     MusicPlayer9 musicPlayer;

    public Computer(MusicPlayer9 musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=1;
    }

    @Override
    public String toString() {
        return "Computer id" + id + " " + musicPlayer.playMusic();
    }
}
