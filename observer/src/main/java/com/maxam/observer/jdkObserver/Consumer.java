package com.maxam.observer.jdkObserver;

import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by maxam0128 on 2016/12/26.
 */
public class Consumer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Producer){
            Producer producer = (Producer) o;
            producer.produce();
        }
        System.out.println("producer produce,this can consume...");
    }
}
