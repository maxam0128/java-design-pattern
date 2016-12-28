package com.maxam.observer.pub_sub;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public interface IObserver {

    public void update(String desc);

    public void subscribe();

    public void unsubscribe();

}
