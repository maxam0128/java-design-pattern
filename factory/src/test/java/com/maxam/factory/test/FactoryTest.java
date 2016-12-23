package com.maxam.factory.test;

import com.maxam.factory.ITravel;
import com.maxam.factory.TravelSimpleFactory;
import com.maxam.factory.TravleMutileFactory;
import com.maxam.factory.TravleStaticFactory;
import com.maxam.factory.abstract_factory.Impl.CarPorvider;
import com.maxam.factory.abstract_factory.Provider;
import org.junit.Test;

/**
 * Created by maxam0128 on 2016/12/19.
 */
public class FactoryTest {

    @Test
    public void simpleFactoryTest(){
        TravelSimpleFactory factory = new TravelSimpleFactory();

        ITravel travel = factory.produce("car");
        travel.travle();
    }

    @Test
    public void mutileFactoryTest(){
        TravleMutileFactory factory = new TravleMutileFactory();
        factory.produceTrain().travle();
    }

    @Test
    public void staticFactoryTest(){
        TravleStaticFactory.producePlane().travle();
    }


    @Test
    public void abstracFactoryTest(){
        Provider provider = new CarPorvider();
        ITravel travel = provider.produce();
        travel.travle();
    }
}
