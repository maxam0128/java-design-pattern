package com.maxam.observer.pub_sub;

import java.util.Vector;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class CommentaryObject implements Subject,Commentary {

    // 所有的订阅者
    private Vector<IObserver> observers ;

    private String desc;

    private String subjectDetails;

    public CommentaryObject(Vector<IObserver> observers,String subjectDetails){
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }



    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObserver();
    }

    @Override
    public void subscribeObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(IObserver observer) {
        if(observers!= null){
            if(observers.contains(observer)){
                observers.remove(observer);
            }
        }
    }

    @Override
    public void notifyObserver() {
        //通知所有的订阅者
        for(IObserver observer : observers){
            observer.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }
}
