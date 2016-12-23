package com.maxam.adapter;

/**
 * Created by maxam0128 on 2016/12/23.
 */
public class CompositAdapter implements ITarget {
    private Adaptee adaptee;

    public CompositAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void handService() {

    }

    @Override
    public void request() {
        System.out.println("composition adaptor.");
        adaptee.specificRequest();
    }
}
