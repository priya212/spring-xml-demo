package com.stackroute;

import com.stackroute.domain.Movie;
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
        Movie m1=(Movie)context.getBean("movie");
        System.out.println(m1);

        System.out.println("Using XmlBeanFactory");
        Resource resource=new ClassPathResource("beans.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Movie m2=(Movie)factory.getBean("movie");
        System.out.println(m2);
    }
}
