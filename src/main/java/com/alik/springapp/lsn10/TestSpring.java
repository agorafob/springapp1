package com.alik.springapp.lsn10;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn10/applicationContext.xml");
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic class1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic class2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(class1 == class2);

        context.close();
    }
}
