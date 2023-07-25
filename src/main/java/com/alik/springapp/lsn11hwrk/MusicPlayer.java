package com.alik.springapp.lsn11hwrk;


import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> musicGenre;


    public MusicPlayer(List<Music> musicGenre) {
        this.musicGenre = musicGenre;
    }

    public void playMusic(){
        Random r = new Random();
        System.out.println(musicGenre.get(r.nextInt(musicGenre.size())).getSong());
    }

}
