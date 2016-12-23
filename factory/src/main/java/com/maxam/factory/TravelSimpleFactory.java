package com.maxam.factory;

import com.maxam.factory.Impl.Car;
import com.maxam.factory.Impl.OnFoot;
import com.maxam.factory.Impl.Plane;
import com.maxam.factory.Impl.Train;

import java.security.InvalidParameterException;

/**
 * Created by maxam0128 on 2016/12/19.
 */
public class TravelSimpleFactory {

    public ITravel produce(String type){
        if("car".equalsIgnoreCase(type)){
            return new Car();
        } else if ("train".equalsIgnoreCase(type)) {
            return new Train();
        }else if ("plane".equalsIgnoreCase(type)){
            return new Plane();
        }else if ("onFoot".equalsIgnoreCase(type)){
            return new OnFoot();
        }else {
            throw new InvalidParameterException("params exception,there is no " + type +
                    "travel.");
        }
    }
}
