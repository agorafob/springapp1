package com.alik.springapp.lsn8.hmwrk;

import org.springframework.stereotype.Component;

@Component("first")
public class FirstLayer {
    SecondLayer secondLayer ;

    public FirstLayer(SecondLayer secondLayer) {
        this.secondLayer = secondLayer;
    }
    void printFirst(){
        secondLayer.printSecond();
    }
}
