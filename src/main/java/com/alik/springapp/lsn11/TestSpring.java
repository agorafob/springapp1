package com.alik.springapp.lsn11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
//        MusicPlayer11 musicPlayer = context.getBean("musicPlayer11", MusicPlayer11.class);
        Computer11 computer =context.getBean("computer", Computer11.class);
        System.out.println(computer);
        context.close();
    }
}
