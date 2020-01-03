package com.bridgelabz.spring.autowiring_by_mixed_configration_autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	//creating bean by application context.
    	//if you have created configration class then use this.
    	
    	//ApplicationContext context = new AnnotationConfigApplicationContext("ConfigrationClass.class");
    	 
    	
    	//if we have used xml file then use this.
     ApplicationContext context = new ClassPathXmlApplicationContext("context_autowire.xml");
    	 
    	 
    Human human =	context.getBean("humanObj" ,Human.class);
    	
    	
    	 
    	human.StartPumping();
    	
    	
    	
    }
}
