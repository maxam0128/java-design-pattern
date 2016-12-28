package com.maxam.observer.jdkObserver;

import java.util.Observable;

/**
 * Created by maxam0128 on 2016/12/26.
 */
public class Producer extends Observable {

    public void produce(){
        setChanged();
        notifyObservers();
    }
}
