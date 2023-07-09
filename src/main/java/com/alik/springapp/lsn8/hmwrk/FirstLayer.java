package com.alik.springapp.lsn8.hmwrk;

import org.springframework.stereotype.Component;

@Component
public class FirstLayer {
    SecondLayer secondLayer ;

    public FirstLayer(SecondLayer secondLayer) {
        this.secondLayer = secondLayer;
    }
    void firstPlay(){
        secondLayer.printSecond();
    }
}
