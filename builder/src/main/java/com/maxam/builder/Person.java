package com.maxam.builder;

/**
 * Created by maxam0128 on 2016/12/21.
 */

public class Person {
    private String id;

    private String name;

    private Sex sex;

    private Integer age;

    private String address;

    private String email;

    public Person(String id){
        this.id = id;
    }
    public Person(String id,String name){
        this.id = id;
        this.name = name;
    }
    public Person(String id,String name,Sex sex){
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
    public Person(String id,String name,Sex sex,Integer age){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Person(String id,String name,Sex sex,Integer age,String address){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }
    public Person(String id,String name,Sex sex,Integer age,String address,String email){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.email = email;
    }

}
