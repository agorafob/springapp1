package com.alik.springapp.lsn11;


public class Computer11 {
    int id;
     MusicPlayer11 musicPlayer;

    public Computer11(MusicPlayer11 musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=1;
    }

    @Override
    public String toString() {
        return "Computer id" + id + " " + musicPlayer.playMusic();
    }
}
