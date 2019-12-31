package com.bridgelabz.hibernate.SpringUsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
        
    	Vehicle obj = (Vehicle) con.getBean("vehicle");/*bean id*/ 
    	obj.drive();
    	
    	
    }
}
