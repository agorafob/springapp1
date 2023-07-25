package com.alik.springapp.lsn11;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("classpath:lsn11/musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        System.out.println("creating classic 11");
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        System.out.println("creating rock 11");
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        System.out.println("creating musicplayer 11");
        return new MusicPlayer(classicalMusic(),rockMusic());
    }

    @Bean
    @Scope("prototype")
    public Computer computer(){
        System.out.println("creating computer 11");
        return new Computer(musicPlayer());
    }
}
