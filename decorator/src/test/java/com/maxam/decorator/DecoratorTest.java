package com.maxam.decorator;

import org.junit.Test;

/**
 * Created by maxam0128 on 2016/12/24.
 */
public class DecoratorTest {

    @Test
    public void decoratorTest(){
        Source source = new Source();
        ISourceable iSourceable = new Decorator(source);
        iSourceable.method();


//        ISourceable iSourceable1 = new Decorator(new Decorator2(source))

    }
}
