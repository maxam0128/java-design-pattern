package com.maxam.builder;

/**
 * Created by maxam0128 on 2016/12/21.
 */
public class PersonBuilder {

    private String id;

    private String name;

    private Sex sex;

    private Integer age;

    private String address;

    private String email;

    private PersonBuilder(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
        this.address = builder.address;
        this.email = builder.email;
    }

    public static class Builder{
        private String id;

        private String name;

        private Sex sex;

        private Integer age;

        private String address;

        private String email;

        public Builder(String id){
            this.id = id;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setSex(Sex sex){
            this.sex = sex;
            return this;
        }
        public Builder setAge(Integer age){
            this.age = age;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }


        public PersonBuilder build(){
            return new PersonBuilder(this);
        }
    }

    public String toString(){
        return  "id:" + this.id +",name:"+this.name+",sex:"+sex.value()+",age:"+this.age+",address:"+this.address+",email:"+this.email;
    }
}
