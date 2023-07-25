package com.alik.springapp.lsn11hwrk.config;

import com.alik.springapp.lsn11hwrk.Music;
import com.alik.springapp.lsn11hwrk.MusicPlayer;
import com.alik.springapp.lsn11hwrk.genres.ClassicalMusic;
import com.alik.springapp.lsn11hwrk.genres.JazzMusic;
import com.alik.springapp.lsn11hwrk.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public List<Music> musicGenre(){
     return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic());
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicGenre());
    }

}
