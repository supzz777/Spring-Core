package com.bridgelabz.spring.creating_bean_inside_configclass;

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
    	 
    	
    	
   //College college = context.getBean("collegeObj",College.class); //creating collegeObj as bean of college class.
   College college = context.getBean("xxx",College.class); 	//bean ID should be proper .
    	System.out.println("obj made by the spring through configuration class is :"+college);
    	
    	 college.test();

    	 //close the context
	 	( (AnnotationConfigApplicationContext) context ).close(); 
	 	/*interface doesnt have close method so typecast it inside the class.*/ 
 													
    	
    }
}
