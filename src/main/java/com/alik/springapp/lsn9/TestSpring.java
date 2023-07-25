package com.alik.springapp.lsn9;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lsn9/applicationContext.xml");
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
}
