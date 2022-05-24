package com.genspark.annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main app
 *
 */
public class App
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext("SpringAnnotation.xml");
        }catch (BeansException e){
            System.out.println("ApplicationContext error:" + e.getLocalizedMessage());
            System.exit(1);
        }
        Person person = (Person) context.getBean("student");
        System.out.println(person);
        context.close();
    }
}
