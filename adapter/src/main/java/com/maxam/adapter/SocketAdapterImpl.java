package com.maxam.adapter;

/**
 * Created by maxam0128 on 2016/12/21.
 * 通过继承的方式实现适配器
 */
public class SocketAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {

        return getVolt();
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();

        return convertVolt(v,40);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(),10);
    }

    private Volt convertVolt(Volt v,int i){
        return new Volt(v.getVolt()/i);
    }


}
