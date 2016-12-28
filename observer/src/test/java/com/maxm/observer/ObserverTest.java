package com.maxm.observer;

import com.maxam.observer.jdkObserver.Consumer;
import com.maxam.observer.jdkObserver.Producer;
import com.maxam.observer.pub_sub.*;
import org.junit.Test;

import java.util.Observer;
import java.util.Vector;

/**
 * Created by maxam0128 on 2016/12/26.
 */
public class ObserverTest {

    @Test
    public void pcTest(){

        Observer consumer = new Consumer();
        Producer producer  =new Producer();
        producer.addObserver(consumer);
        for(int i = 0;i<10;i++){
            producer.produce();
        }
    }


    @Test
    public void pub_subTest(){
        Subject subject = new CommentaryObject(new Vector<IObserver>(),"2016-NBA-Seasons.");
        IObserver observer = new SMSUsers(subject,"Adam Warner [New York]");
        observer.subscribe();
        System.out.println("======================");
        IObserver observer1 = new SMSUsers(subject,"Tim Ronney [London]");
        observer1.subscribe();
        Commentary cObject = (Commentary) subject;
        cObject.setDesc("Welcome to live Soccer match");
        cObject.setDesc("Current score 0-0");
        System.out.println("======================");
        observer1.unsubscribe();
        System.out.println("======================");
        cObject.setDesc("It's a goal!!");
        cObject.setDesc("Current score 1-0");

        IObserver observer2 = new SMSUsers(subject,"Marrie [Paris]");

        observer2.subscribe();
        System.out.println("======================");

        cObject.setDesc("It's another goal!!");
        cObject.setDesc("Half-time score 2-0");

    }
}
