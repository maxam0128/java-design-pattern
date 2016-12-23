package com.maxam.adapter;

/**
 * Created by maxam0128 on 2016/12/21.
 */
public class SocketAdapterImpl2 implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(),40);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(),10);
    }

    private Volt convertVolt(Volt v,int i){
        return new Volt(v.getVolt()/i);
    }
}
