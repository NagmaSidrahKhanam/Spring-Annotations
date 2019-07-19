package com.spring.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
//creating name, gender and age
    @Value("Nagma")
    private String name;

    @Value("female")
    private String gender;

    @Value("28")
    private int age;
    //getter methods
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}