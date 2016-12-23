package com.maxam.decorator;

/**
 * Created by maxam0128 on 2016/12/24.
 */
public class Decorator2 implements ISourceable {
    private Source source;

    public Decorator2(Source source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("second decorator this method.");
        source.method();
        System.out.println("second decorator end.");
    }
}
