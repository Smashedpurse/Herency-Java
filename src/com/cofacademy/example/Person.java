package com.cofacademy.example;

public class Person {
    private String name;
    private int age;

    //CONSTRUCTOR
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    //GETTERS
    public String getName(){
        return  name;
    }

    public int getAge(){
        return age;
    }
}
