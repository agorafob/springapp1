package com.alik.springapp.lsn8.hmwrk;

import org.springframework.stereotype.Component;

@Component
public class SecondLayer {
    public ThirdLayer thirdLayer;

    public SecondLayer(ThirdLayer thirdLayer) {
        this.thirdLayer = thirdLayer;
    }

    public void printSecond(){
        thirdLayer.printThird();
    }
}
