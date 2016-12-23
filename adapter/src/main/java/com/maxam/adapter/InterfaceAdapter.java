package com.maxam.adapter;

/**
 * Created by maxam0128 on 2016/12/23.
 *
 * 此类适配器只是为了实现自己想要适配的接口,适配器屏蔽了自己不关心的接口
 */
public class InterfaceAdapter extends AbstractAdapter {
    private Adaptee adaptee;

    public InterfaceAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request(){
        System.out.println("interface adapter method");
        adaptee.specificRequest();
    }
}
