package com.maxam.pattern.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by maxam0128 on 2016/12/07.
 */
public class SpringBeanContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext;



    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    public static <T> T getBeanByType(Class<T> clazz){
        Map beans = applicationContext.getBeansOfType(clazz);
        if(null != beans && !beans.isEmpty()){
            if(beans.size() > 1){
                throw new RuntimeException("there are " + beans.size() + "for implements for " + clazz);
            }else {
                return (T) beans.values().iterator().next();
            }
        }else {
            return null;
        }
    }

    public static <T> List<T> getBeansByType(Class<T> clazz){
        Map beans = applicationContext.getBeansOfType(clazz);
        if(null != beans && !beans.isEmpty()){
            if(beans.size() > 1){
                throw new RuntimeException("there are " + beans.size() + "for implements for " + clazz);
            }else {
                return new ArrayList<T>(beans.values());
            }
        }else {
            return null;
        }
    }
}
