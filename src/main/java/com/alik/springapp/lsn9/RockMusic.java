package com.alik.springapp.lsn9;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind Cries Mary 9 ";
    }
}
