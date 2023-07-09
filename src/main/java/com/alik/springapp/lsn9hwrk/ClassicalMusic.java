package com.alik.springapp.lsn9hwrk;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> classicalMusicPlaylist = Arrays.asList("bah","mozart","vivaldi");

    public void getSong(int index) {

        System.out.println(classicalMusicPlaylist.get(index));
    }
}
