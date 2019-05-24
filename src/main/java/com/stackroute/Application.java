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
        System.out.println("Using Application Context");

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)context.getBean("movie");
        System.out.println(movie1.getId()+" "+movie1.getActor()+ " acted in : "+movie1.getMovieName());



        Movie movie2=(Movie)context.getBean("movie1");
        System.out.println(movie2.getId()+" "+movie2.getActor()+ " acted in : "+movie2.getMovieName());

        Movie movie3=(Movie)context.getBean("movie2");
        System.out.println(movie3.getId()+" "+movie3.getActor()+ " acted in : "+movie3.getMovieName());

        Movie movie5=(Movie)context.getBean("movie1");
        System.out.println(movie2==movie5);

        // testing bean scope
        ApplicationContext context1=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie4=(Movie)context.getBean("movie2");
        System.out.println(movie3==movie4);

        //Movie bean by its two different name
        Movie movie6=(Movie)context.getBean("movieA");
        Movie movie7=(Movie)context.getBean("movieB");
        System.out.println(movie6.getId()+" "+movie6.getActor()+ " acted in : "+movie6.getMovieName());
        System.out.println(movie7.getId()+" "+movie7.getActor()+ " acted in : "+movie7.getMovieName());




    }
}
