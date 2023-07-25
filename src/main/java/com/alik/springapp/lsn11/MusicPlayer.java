package com.alik.springapp.lsn11;


import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PreDestroy;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;


    public MusicPlayer(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return ("Playing: " + music1.getSong()+", "+music2.getSong());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy musicplayer 11");
    }
}
