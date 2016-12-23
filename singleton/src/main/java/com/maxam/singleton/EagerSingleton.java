package com.maxam.singleton;

/**
 * Created by maxam0128 on 2016/12/20.
 *
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

}
