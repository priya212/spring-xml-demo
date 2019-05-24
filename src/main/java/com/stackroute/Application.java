package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import  org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Application {
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Using autowire byName");
        Movie movie1=(Movie)context.getBean("movie");
        System.out.println(movie1.getId()+" "+movie1.getActor()+ " acted in : "+movie1.getMovieName());

        /*System.out.println("Using autowire byType");
        Movie movie2=(Movie)context.getBean("movie1");
        System.out.println(movie2.getId()+" "+movie2.getActor()+ " acted in : "+movie2.getMovieName());*/

    }
}
