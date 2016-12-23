package com.maxam.builder;

import org.junit.Test;

/**
 * Created by maxam0128 on 2016/12/21.
 */
public class PersonTest {

    @Test
    public void test(){
        PersonBuilder person = new PersonBuilder.Builder("1")
                .setName("Jack")
                .setSex(Sex.M)
                .setAge(20).build();
        System.out.println(person.toString());
    }
}
