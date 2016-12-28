package com.maxam.observer.pub_sub;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public interface Subject{

    public void subscribeObserver(IObserver observer);

    public void unsubscribeObserver(IObserver observer);

    public void notifyObserver();

    public String subjectDetails();
}
