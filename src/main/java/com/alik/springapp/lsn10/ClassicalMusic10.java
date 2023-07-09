package com.alik.springapp.lsn10;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic10 implements Music {
    @PostConstruct
    public void doInit(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

    public String getSong() {
        return "Rapsody 10 ";
    }
}
