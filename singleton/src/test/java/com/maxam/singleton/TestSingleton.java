package com.maxam.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by maxam0128 on 2016/12/20.
 */
public class TestSingleton {

    /**
     * 单例模式测试
     *
     */
    @Test
    public void eagerSingletonTest(){
        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance.hashCode());
    }

    /**
     * 根据类加载机制实现了线程安全的单例模式
     */
    @Test
    public void innerStaticSingletonTest(){

    }

    /**
     * 通过枚举类实现的单例模式是及是线程安全的有可以方便的序列化,
     * 也不会因为反射等方法破坏单例模式
     */
    @Test
    public void enumSingletonTest(){
        EnumSingleton.INSTANCE.doBusinessJob();
    }


    /**
     *
     * 通过反射破坏单例模式
     */
    @Test
    public void reflectionSingletonTest(){
        InnerStaticClazzSingleton instanceOne = InnerStaticClazzSingleton.getInstance();

        InnerStaticClazzSingleton instanceTwo = null;

        Constructor[] constructors = InnerStaticClazzSingleton.class.getDeclaredConstructors();
        try {
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instanceTwo = (InnerStaticClazzSingleton) constructor.newInstance();
                break;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}
