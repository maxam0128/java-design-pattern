package com.maxam.pattern;

import com.maxam.pattern.calculator.AddCalculator;
import com.maxam.pattern.calculator.MutiplyCalculator;
import com.maxam.pattern.calculator.SubCalculator;

/**
 * Created by maxam0128 on 2016/12/07.
 */
public class CalculatorTest {

    public static void main(String[] args){
        try {
            getCalculator(3,39,34).calculator();
            getCalculator(1,39,34).calculator();
            getCalculator(2,39,34).calculator();
            getCalculator(123,39,34).calculator();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static Calculator getCalculator(int method,int a,int b){
        Calculator calculator ;
        switch (method){
            case 1:
                calculator = new AddCalculator(a,b);
                break;
            case 2:
                calculator = new SubCalculator(a,b);
                break;
            case 3:
                calculator = new MutiplyCalculator(a,b);
                break;
            default:
                calculator = new AddCalculator(a,b);
        }
        return calculator;
    }

}
