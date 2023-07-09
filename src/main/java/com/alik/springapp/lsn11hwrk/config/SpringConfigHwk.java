package com.alik.springapp.lsn11hwrk.config;

import com.alik.springapp.lsn11hwrk.*;
import com.alik.springapp.lsn11hwrk.genres.ClassicalMusicHwk;
import com.alik.springapp.lsn11hwrk.genres.JazzMusic;
import com.alik.springapp.lsn11hwrk.genres.RockMusic11Hwk;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigHwk {

    @Bean
    public List<MusicHwk> musicGenre(){
        List<MusicHwk> musicGenre = new ArrayList<MusicHwk>();
        musicGenre.add(classicalMusic());
        musicGenre.add(rockMusic());
        musicGenre.add(jazzMusic());
        return musicGenre;
        //Arrays.asList...
    }


    @Bean
    public ClassicalMusicHwk classicalMusic() {
        return new ClassicalMusicHwk();
    }

    @Bean
    public RockMusic11Hwk rockMusic() {
        return new RockMusic11Hwk();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayerHwk musicPlayer(){
        return new MusicPlayerHwk(musicGenre());
    }

}
