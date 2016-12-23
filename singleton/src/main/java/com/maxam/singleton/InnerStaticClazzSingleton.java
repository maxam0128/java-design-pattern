package com.maxam.singleton;

/**
 * Created by maxam0128 on 2016/12/20.
 * 根据类加载的机制实现线程安全的延迟初始化
 *
 */
public class InnerStaticClazzSingleton {

    private InnerStaticClazzSingleton(){

    }

    private static class SingletonHolder{
        private static final InnerStaticClazzSingleton instance = new InnerStaticClazzSingleton();
    }

    public static InnerStaticClazzSingleton getInstance(){
        return SingletonHolder.instance;
    }


}
