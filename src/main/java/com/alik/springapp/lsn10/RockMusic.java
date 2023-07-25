package com.alik.springapp.lsn10;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind Cries Mary 10 ";
    }
}
