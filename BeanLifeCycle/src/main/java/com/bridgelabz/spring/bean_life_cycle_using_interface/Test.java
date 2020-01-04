package com.bridgelabz.spring.bean_life_cycle_using_interface;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
			//	get object from application context
			/*
			StudentDAO d = new StudentDAO();
			d.fetchAllRows(); //it adds the throws declaration around the main method.
			d.deleteRecord();
			*/
		
		//ApplicationContext or BeanFactory is used to create the Beans.
		ApplicationContext context = new  ClassPathXmlApplicationContext("interfaceusing.xml");
		
		//setters of the variables are imp to inject the beans.
		StudentDAO studentDAOobject = context.getBean("studentDAOobject",StudentDAO.class);
		System.out.println(studentDAOobject);
		studentDAOobject.fetchAllRows(); 
		studentDAOobject.deleteRecord();
		
		/*add cast to context because ApplicationContext is interface and interface cannot be closed.*/
		//((AbstractApplicationContext) context).close(); 
		 					// close()	(OR) registerShutdownHook()
		((AbstractApplicationContext) context).registerShutdownHook();
		
		
		/*  Q)  difference between registerShutdownHook() and close()	-->
		 * 
		 *  registerShutdownHook method can be called anywhere it gets executed once your thread ends.
		 *  hence it will not throw any exception . But after using close method it gives an exception.
		 *  also you cannot create another object of the StudentDao classs here if you use close()
		 *  but not in the case of  registerShutdownHook().
		 *  
		 *  
		 *  */
	}

}
