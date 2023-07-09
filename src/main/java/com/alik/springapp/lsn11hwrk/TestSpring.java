package com.alik.springapp.lsn11hwrk;

import com.alik.springapp.lsn11hwrk.config.SpringConfigHwk;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigHwk.class);
        MusicPlayerHwk musicPlayer = context.getBean("musicPlayer", MusicPlayerHwk.class);
        musicPlayer.playMusic();
        context.close();
    }
}
