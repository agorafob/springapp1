package com.alik.springapp.lsn11;


import org.springframework.context.annotation.Scope;

import javax.annotation.PreDestroy;

public class Computer {
    int id;
     MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=1;
    }

    @Override
    public String toString() {
        return "Computer id " + id + " " + musicPlayer.playMusic();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy computer 11");
    }
}
