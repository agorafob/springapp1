package com.alik.springapp.lsn8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

//    public String playMusic() {
//        return ("Playing: " + classicalMusic.getSong());
//    }

    //        private RockMusic rockMusic;

//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    //    @Autowired
//    private Music music;

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
    }

//@Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//    }

}
