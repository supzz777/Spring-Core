package com.bridgelabz.spring.creating_bean_inside_configclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
@Configuration /*this annotation will tell the spring that this is a configuration class.
 				this acts as a xml file.
@ComponentScan(basePackages = "com.bridgelabz.spring.autowiring_by_annotations_no_xmlfile")

		NO NEED OF ANY ANNOTATIONS AS WE ARE CREATING THE BEANS IN THE CONFIG CLASS.
*/


public class ConfigClass
{
	@Bean (name = "xxx") //this is the bean ID.
	public College collegeObj() //method name and bean ID name should be same in this case.
	{	
		//for constructor using feild.
		//College coll = new College(principal()); //injecting one bean into the another.
		
		                       //OR
		//for setters and getters.
		College coll = new College();
		coll.setPrincipal(principalObj()); //injecting bean inside the setter method.
		
		
		System.out.println("object of college is being created.");
		return coll;
		
	}
	
	@Bean
	public Principal principalObj()
	{
		Principal p = new Principal();
		System.out.println("object of principal is being created.");

		return p;
	}
	
	

}
