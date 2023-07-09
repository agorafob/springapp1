package com.alik.springapp.lsn9hwrk;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(ListOfGenre genre) {
        Random r = new Random();
        int index = r.nextInt(3);
        if(genre == ListOfGenre.CLASSICAL){
            classicalMusic.getSong(index);
        }else {
            rockMusic.getSong(index);
        }

    }
}
