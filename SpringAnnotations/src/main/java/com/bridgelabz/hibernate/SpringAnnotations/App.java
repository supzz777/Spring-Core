package com.bridgelabz.hibernate.SpringAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
       //Samsung s7 = new Samsung(); //alternative way of directly creating the objects is down.
       
       ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
       /*ApplicationContext--> Interface
        * AnnotationConfigApplicationContext --> Class
        * create a class which will provide the configurations.
        * name the created class inside the parenthesis of AnnotationConfigApplicationContext.
        * specify the method as bean which you are working with.
        * Hence no xml file is used in this program ..everything is annotations based.
        */
       
       Samsung s7 = factory.getBean(Samsung.class); //thus the object of 
       //The management of a Spring bean includes: creating an object. providing dependencies 
       
       
       s7.config();
    }
}
