package com.spring.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//configuration class
@Configuration
public class ConfigClass {
//creating bean
    @Bean
    public Movie movieBean (){
        Movie movie = new Movie();
        movie.setActor(actorBean());
        return movie;
    }

    @Bean
    public Actor actorBean ()
    {
        return new Actor();
    }

}