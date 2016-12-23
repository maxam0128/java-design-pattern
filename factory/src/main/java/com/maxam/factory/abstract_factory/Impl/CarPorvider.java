package com.maxam.factory.abstract_factory.Impl;

import com.maxam.factory.ITravel;
import com.maxam.factory.Impl.Car;
import com.maxam.factory.abstract_factory.Provider;

/**
 * Created by maxam0128 on 2016/12/19.
 */
public class CarPorvider implements Provider {
    @Override
    public ITravel produce() {
        return new Car();
    }
}
