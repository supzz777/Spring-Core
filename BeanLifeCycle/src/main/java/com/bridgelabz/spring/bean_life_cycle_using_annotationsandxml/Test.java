package com.bridgelabz.spring.bean_life_cycle_using_annotationsandxml;

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
		ApplicationContext context = new  ClassPathXmlApplicationContext("xmlandannotations.xml");
		
		//setters of the variables are imp to inject the beans.
		StudentDAO studentDAOobject = context.getBean("studentDAOobject",StudentDAO.class);
		System.out.println(studentDAOobject);
		studentDAOobject.fetchAllRows(); 
		studentDAOobject.deleteRecord();
		
		/*add cast to context because ApplicationContext is interface and interface cannot be closed.*/
		//((AbstractApplicationContext) context).close(); 
		 					// close()	(OR) registerShutdownHook()
		((AbstractApplicationContext) context).registerShutdownHook();

	}

}
