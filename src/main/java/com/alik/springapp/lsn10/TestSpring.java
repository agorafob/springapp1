package com.alik.springapp.lsn10;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn10/applicationContext.xml");
        MusicPlayer10 musicPlayer=context.getBean("musicPlayer10", MusicPlayer10.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic10 class1 = context.getBean("classicalMusic10",ClassicalMusic10.class);
        ClassicalMusic10 class2 = context.getBean("classicalMusic10",ClassicalMusic10.class);
        System.out.println(class1 == class2);
        context.close();
    }
}
