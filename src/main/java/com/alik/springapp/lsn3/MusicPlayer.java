package com.alik.springapp.lsn3;

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
