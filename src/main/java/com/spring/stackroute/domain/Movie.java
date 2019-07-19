package com.spring.stackroute.domain;

public class Movie {
    //creating Actor Object
    private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //display method
    public void display()
    {
        System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+"Age: "+actor.getAge() );
    }
}
