package com.maxam.decorator;

/**
 * Created by maxam0128 on 2016/12/24.
 */
public class Source implements ISourceable {
    public void method() {
        System.out.println("the original method.");
    }
}
