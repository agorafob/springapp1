package com.alik.springapp.lsn2;

public class MusicPlayer {
    private Music music;
//Inversion of control
    public MusicPlayer(Music music){
        this.music=music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
