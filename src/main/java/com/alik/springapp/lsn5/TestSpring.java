package com.alik.springapp.lsn5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn5/applicationContext.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer5", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer5", MusicPlayer.class);

        boolean compare = firstMusicPlayer==secondMusicPlayer;


        System.out.println(compare);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
