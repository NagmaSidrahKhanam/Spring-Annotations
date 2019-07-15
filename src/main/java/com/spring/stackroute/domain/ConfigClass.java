package com.spring.stackroute.domain;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigClass {

//	Movie Beans

    @Bean
    public Movie movieObj (){
        return new Movie(actor());
    }

    @Bean
    public Movie movieObj1 (){
        return new Movie(actorObj());
    }

    @Bean
    public Actor actorObj (){
        return new Actor("SRK","male",39);
    }

    @Bean
    public Actor actor (){
        return new Actor("Salman khan","male",30);
    }

}