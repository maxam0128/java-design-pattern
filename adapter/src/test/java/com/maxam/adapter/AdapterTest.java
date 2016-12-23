package com.maxam.adapter;

import org.junit.Test;

/**
 * Created by maxam0128 on 2016/12/23.
 */
public class AdapterTest {

    @Test
    public void inhertAdapterTest(){
        InheritAdapter inheritAdapter = new InheritAdapter();

        inheritAdapter.request();
    }

    @Test
    public void compositAdapterTest(){
        Adaptee adaptee = new Adaptee();

        CompositAdapter compositAdapter = new CompositAdapter(adaptee);

        compositAdapter.request();
    }
}
