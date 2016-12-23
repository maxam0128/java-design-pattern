package com.maxam.builder;

/**
 * Created by maxam0128 on 2016/12/21.
 */
public enum  Sex {
    F("female"),
    M("male");

    private String value;

    private Sex(String value){
        this.value = value;
    }

    public String value(){
        return value;
    }

    public boolean equals(Sex sex){
        return sex.value.equals(this.value);
    }
}
