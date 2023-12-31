package com.alik.springapp.lsn9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    int id;
     MusicPlayer musicPlayer;
@Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=1;
    }

    @Override
    public String toString() {
        return "Computer id" + id + " " + musicPlayer.playMusic();
    }
}
