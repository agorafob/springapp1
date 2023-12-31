package com.alik.springapp.lsn10;

import org.springframework.stereotype.Component;

@Component

public class Computer {
    int id;
    MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        this.id = 1;
    }

    @Override
    public String toString() {
        return "Computer id" + id + " " + musicPlayer.playMusic();
    }
}
