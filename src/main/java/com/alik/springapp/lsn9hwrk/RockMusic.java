package com.alik.springapp.lsn9hwrk;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {

    List<String> rockMusicPlaylist = Arrays.asList("queen", "metalica", "doors");

    public void getSong(int index) {
        System.out.println(rockMusicPlaylist.get(index));
    }
}
