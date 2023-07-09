package com.alik.springapp.lsn8.hmwrk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("lsn8/hmwrk/applicationContext.xml");
        FirstLayer firstLayer = context.getBean("firstLayer", FirstLayer.class);
        firstLayer.firstPlay();
    }


}
