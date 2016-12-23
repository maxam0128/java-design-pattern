package com.maxam.factory;

import com.maxam.factory.Impl.Car;
import com.maxam.factory.Impl.OnFoot;
import com.maxam.factory.Impl.Plane;
import com.maxam.factory.Impl.Train;

/**
 * Created by maxam0128 on 2016/12/19.
 */
public class TravleMutileFactory {
    public ITravel produceCar(){
        return new Car();
    }
    public ITravel produceTrain(){
        return new Train();
    }
    public ITravel producePlane(){
        return new Plane();
    }
    public ITravel produceOnFoot(){
        return new OnFoot();
    }
}
