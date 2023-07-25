package com.alik.springapp.lsn9hwrk;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn9hwrk/applicationContext.xml");
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(ListOfGenre.ROCK);
        musicPlayer.playMusic(ListOfGenre.CLASSICAL);
        context.close();
    }
}
