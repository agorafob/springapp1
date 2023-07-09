package com.alik.springapp.lsn11;


public class MusicPlayer11 {

    private Music music1;
    private Music music2;


    public MusicPlayer11(Music music1,  Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return ("Playing: " + music1.getSong()+", "+music2.getSong());
    }
}
