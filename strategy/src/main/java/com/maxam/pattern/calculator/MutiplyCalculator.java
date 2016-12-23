package com.maxam.pattern.calculator;

/**
 * Created by maxam0128 on 2016/12/07.
 */
public class MutiplyCalculator extends AbstractCalculator {
    private int a;
    private int b;

    public MutiplyCalculator(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void calculator() throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " calculate result is " + (a*b) );
    }
}
