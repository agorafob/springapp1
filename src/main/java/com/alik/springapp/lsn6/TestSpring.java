package com.alik.springapp.lsn6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn6/applicationContext.xml");

        ClassicalMusic classicalMusic1 = context.getBean("musicBean6", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean6", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong()+classicalMusic1.hashCode());
        System.out.println(classicalMusic2.getSong()+classicalMusic2.hashCode());


        context.close();
    }
}
