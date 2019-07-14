package com.spring.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("Nagma")
    private String name;

    @Value("female")
    private String gender;

    @Value("28")
    private int age;

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