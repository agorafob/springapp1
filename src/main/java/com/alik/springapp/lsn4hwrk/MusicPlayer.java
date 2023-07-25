package com.alik.springapp.lsn4hwrk;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music mc : musicList) {
            System.out.println(mc.getSong());

        }
    }
}
