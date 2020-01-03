package com.bridgelabz.spring.autowiring_by_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       
    	//creating bean by application context.
    	//if you have created configration class then use this.
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	 
    	System.out.println("xml file is loaded");
    	
   College college = context.getBean("collegeObj",College.class); //creating collegeObj as bean of college class.
    	
    	System.out.println("obj made by the spring is :"+college);
    	 

    	
    }
}
