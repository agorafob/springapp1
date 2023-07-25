package com.alik.springapp.lsn11;

import org.springframework.context.annotation.Scope;

import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    public String getSong() {
        return "Rapsody 11";
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy classic 11");
    }
}
