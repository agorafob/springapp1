package com.alik.springapp.lsn9;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    public String getSong() {
        return "Rapsody 9 ";
    }
}
