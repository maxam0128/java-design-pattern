package com.maxam.observer.pub_sub;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class SMSUsers implements IObserver {
    private Subject subject;

    private String desc;

    private String userInfo;

    public SMSUsers(Subject subject,String userInfo){
        if(subject == null){
            throw new IllegalArgumentException("no publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribe" + subject.subjectDetails() + " successfully.");
    }

    @Override
    public void unsubscribe() {
        System.out.println("UnSubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.unsubscribeObserver(this);
        System.out.println("Subscribing" + subject.subjectDetails() + " successfully.");
    }

    private void display(){
        System.out.println("[" + userInfo +"] : " + desc );
    }
}
