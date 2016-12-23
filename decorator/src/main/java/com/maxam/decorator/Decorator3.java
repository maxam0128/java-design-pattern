package com.maxam.decorator;

/**
 * Created by maxam0128 on 2016/12/24.
 */
public class Decorator3 implements ISourceable {
    private Source source;

    public Decorator3(Source source){
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("third decorator this method.");
        source.method();
        System.out.println("third decorator end.");
    }
}
