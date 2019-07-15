package com.spring.stackroute;

import com.spring.stackroute.domain.BeanLifecycleDemoBean;

import com.spring.stackroute.domain.BeanPostProcessorDemoBean;
import com.spring.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.stackroute.domain");

        Movie movie = context.getBean("movieObj",Movie.class);
        movie.display();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean =  (BeanPostProcessorDemoBean) context.getBean("beanPostProcessorDemo");
    }
}

