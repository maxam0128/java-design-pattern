package com.maxam.singleton;

/**
 * Created by maxam0128 on 2016/12/20.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
