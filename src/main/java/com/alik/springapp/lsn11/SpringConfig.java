package com.alik.springapp.lsn11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:lsn11/musicPlayer11.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic11 classicalMusic(){
        return new ClassicalMusic11();
    }

    @Bean
    public RockMusic11 rockMusic(){
        return new RockMusic11();
    }

    @Bean
    public MusicPlayer11 musicPlayer(){
        return new MusicPlayer11(classicalMusic(),rockMusic());
    }

    @Bean
    public Computer11 computer(){
        return new Computer11(musicPlayer());
    }
}
