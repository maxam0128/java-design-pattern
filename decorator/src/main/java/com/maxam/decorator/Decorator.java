package com.maxam.decorator;

/**
 * Created by maxam0128 on 2016/12/24.
 *
 */
public class Decorator implements ISourceable {
    private Source source;

    public Decorator(Source source){
        this.source = source;
    }

    public void method() {

        System.out.println("first decorator this method.");
        source.method();
        System.out.println("first decorator end.");

    }
}
