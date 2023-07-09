package com.alik.springapp.lsn10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer10 {
    @Value("${musicPlayer10.name}")
    private String name;
    @Value("${musicPlayer10.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

@Autowired
    public MusicPlayer10(@Qualifier("rockMusic10") Music music1, @Qualifier("classicalMusic10") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return ("Playing: " + music1.getSong()+", "+music2.getSong());
    }
}
