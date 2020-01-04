package com.bridgelabz.spring.bean_scope_singletone;

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
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("beanscope_singletone.xml");
    	
    	//checking the prototype scope of the Bean.
    	Restaurant restaurantObject1 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject1.setWelcomeNote("Welcome Sir");
    	restaurantObject1.greetCustomer();
    	
    	Restaurant restaurantObject2 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject2.setWelcomeNote("hey Sir");
    	restaurantObject2.greetCustomer();
    	

    	Restaurant restaurantObject4 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject4.greetCustomer();
    	
    	Restaurant restaurantObject7 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject7.greetCustomer();
    	
    	Restaurant restaurantObject5 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject5.setWelcomeNote("hey hey again sir");
    	restaurantObject5.greetCustomer();
    	
    	Restaurant restaurantObject6 = context.getBean("restaurantObj",Restaurant.class);
    	restaurantObject6.greetCustomer();
    	
    	
    	((AbstractApplicationContext) context).close();
    }
}
