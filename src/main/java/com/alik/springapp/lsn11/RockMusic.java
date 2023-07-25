package com.alik.springapp.lsn11;


import javax.annotation.PreDestroy;

public class RockMusic implements Music {
    public String getSong() {
        return "Wind Cries Mary 11 ";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy rock 11");
    }
}
