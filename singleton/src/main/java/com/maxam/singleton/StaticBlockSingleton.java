package com.maxam.singleton;

/**
 * Created by maxam0128 on 2016/12/20.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance ;

    private StaticBlockSingleton(){

    }
    static {
        instance = new StaticBlockSingleton();
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }

}
