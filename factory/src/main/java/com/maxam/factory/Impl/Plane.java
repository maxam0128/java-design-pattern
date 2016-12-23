package com.maxam.factory.Impl;

import com.maxam.factory.ITravel;

/**
 * Created by maxam0128 on 2016/12/19.
 */
public class Plane implements ITravel {
    @Override
    public void travle() {
        System.out.println("travel by plane.");
    }
}
