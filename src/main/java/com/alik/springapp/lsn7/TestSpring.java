package com.alik.springapp.lsn7;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn7/applicationContext.xml");
        Music rockMusic = context.getBean("rockMusic", Music.class);
        Music clasicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer mp = new MusicPlayer(rockMusic);
        mp.playMusic();
        MusicPlayer mp2 = new MusicPlayer(clasicalMusic);
        mp2.playMusic();
        context.close();
    }
}
