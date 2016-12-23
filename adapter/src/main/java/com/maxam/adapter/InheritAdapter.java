package com.maxam.adapter;

/**
 * Created by maxam0128 on 2016/12/23.
 * 此处是用继承实现的适配器
 */
public class InheritAdapter extends Adaptee implements ITarget {


    @Override
    public void request() {
        System.out.println("inherit adapter method.");
        super.specificRequest();

    }
}
