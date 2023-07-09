package com.alik.springapp.lsn10;

import org.springframework.stereotype.Component;
@Component

public class Computer {
    int id;
     MusicPlayer10 musicPlayer;

    public Computer(MusicPlayer10 musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id=1;
    }

    @Override
    public String toString() {
        return "Computer id" + id + " " + musicPlayer.playMusic();
    }
}
