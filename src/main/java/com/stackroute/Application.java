package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)context.getBean("movie");
        System.out.println(movie1.getActor().getName()+ " acted in: "+movie1.getMovieName());

    }
}
