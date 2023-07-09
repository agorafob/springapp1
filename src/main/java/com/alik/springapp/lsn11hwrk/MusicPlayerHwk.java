package com.alik.springapp.lsn11hwrk;


import java.util.List;
import java.util.Random;

public class MusicPlayerHwk {
    List<MusicHwk> musicGenre;


    public MusicPlayerHwk(List<MusicHwk> musicGenre) {
        this.musicGenre = musicGenre;
    }

    public void playMusic(){
        Random r = new Random();
        System.out.println(musicGenre.get(r.nextInt(musicGenre.size())).getSong());
    }

}
