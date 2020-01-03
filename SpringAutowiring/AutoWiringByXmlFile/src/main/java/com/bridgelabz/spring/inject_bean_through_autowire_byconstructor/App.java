package com.bridgelabz.spring.inject_bean_through_autowire_byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       
    	//creating bean by application context.
    	//if you have created configration class then use this.
    	// ApplicationContext context = new AnnotationConfigApplicationContext("autowire.xml");
    	 
    	
    	//if we have used xml file then use this.
    	 ApplicationContext context = new ClassPathXmlApplicationContext("autowire_by_constructor.xml");
    	 
    	 
    	 Human human =	context.getBean("humanObj", Human.class);
    	
    	
    	 
    	human.StartPumping();
    	
    	
    	
    }
}
