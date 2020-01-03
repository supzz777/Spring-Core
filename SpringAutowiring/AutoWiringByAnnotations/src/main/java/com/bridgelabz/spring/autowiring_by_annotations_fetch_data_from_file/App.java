package com.bridgelabz.spring.autowiring_by_annotations_fetch_data_from_file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       
    	//creating bean by application context.
    	//if you have created configration class then use this.
    	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
    	 
    	
    	
   College college = context.getBean("collegeObj",College.class); //creating collegeObj as bean of college class.
    	
    	System.out.println("obj made by the spring through configuration class is :"+college);
    	 
    	college.rag();
    	
    }
}
