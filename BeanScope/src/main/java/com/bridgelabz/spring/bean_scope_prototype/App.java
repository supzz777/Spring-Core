package com.bridgelabz.spring.bean_scope_prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("beanscope_prototype.xml");
    	
    	//checking the prototype scope of the Bean.
    	Restaurant restaurantObject1 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject1.setWelcomeNote("Welcome Sir");
    	restaurantObject1.greetCustomer();
    	
    	Restaurant restaurantObject2 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject2.setWelcomeNote("hey Sir");
    	restaurantObject2.greetCustomer();
    	

    	Restaurant restaurantObject3 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject3.greetCustomer();
    	
    	
    	
    	//((AbstractApplicationContext) context).close();
    }
}
