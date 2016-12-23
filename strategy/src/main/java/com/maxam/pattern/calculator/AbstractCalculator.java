package com.maxam.pattern.calculator;

import com.maxam.pattern.Calculator;
import com.maxam.pattern.spring.SpringBeanContext;

/**
 * Created by maxam0128 on 2016/12/07.
 */
public abstract class AbstractCalculator implements Calculator {

    public <T> T getSpringBeanContext(Class<T> clazz){
        return SpringBeanContext.getBeanByType(clazz);
    }

}
