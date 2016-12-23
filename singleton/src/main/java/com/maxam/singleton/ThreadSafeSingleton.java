package com.maxam.singleton;

/**
 * Created by maxam0128 on 2016/12/20.
 * 此方法是线程安全的单例,但是此种方法在多线程环境下的性能较为低下,
 * 因为每次在调用getInstance方法的时候都要加锁,实际上只有在第一次调用这个方法的时候加锁即可
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}


    public synchronized static ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
