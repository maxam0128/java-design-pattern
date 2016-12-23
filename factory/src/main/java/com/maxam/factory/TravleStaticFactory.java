package com.maxam.factory;

import com.maxam.factory.Impl.Car;
import com.maxam.factory.Impl.OnFoot;
import com.maxam.factory.Impl.Plane;
import com.maxam.factory.Impl.Train;

/**
 * Created by maxam0128 on 2016/12/19.
 */
public class TravleStaticFactory {

    public static ITravel produceCar(){
        return new Car();
    }
    public static ITravel produceTrain(){
        return new Train();
    }
    public static ITravel producePlane(){
        return new Plane();
    }
    public static ITravel produceOnFoot(){
        return new OnFoot();
    }
}
