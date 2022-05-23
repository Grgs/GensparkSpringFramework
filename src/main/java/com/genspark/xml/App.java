package com.genspark.xml;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main app
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext("Spring.xml");
        }catch (BeansException e){
            System.out.println("ApplicationContext error:" + e.getLocalizedMessage());
            System.exit(1);
        }
        Person person = (Person) context.getBean("Person");
        System.out.println(person);
    }
}
