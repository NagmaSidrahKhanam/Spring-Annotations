package com.spring.stackroute.domain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

//	Movie Beans

    @Bean
    public Movie movieObj (){
        return new Movie(actorObj());
    }

    @Bean
    public Actor actorObj (){
        return new Actor("SRK","male",40);
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemo(){
        return new BeanPostProcessorDemoBean();
    }

}