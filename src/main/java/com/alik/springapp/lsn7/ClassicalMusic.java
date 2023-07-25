package com.alik.springapp.lsn7;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public String getSong() {
        return "Rapsody 7 ";
    }
}
