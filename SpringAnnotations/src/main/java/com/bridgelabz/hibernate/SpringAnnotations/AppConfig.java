package com.bridgelabz.hibernate.SpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //this class is responsible to give you the objects specified.
@ComponentScan(basePackages = "com.bridgelabz.hibernate.SpringAnnotations")
public class AppConfig 
{
	
	 
/*
 	@Bean  //specifying this method as bean hence no need to create a bean in xml file.
 
	public Samsung getPhone()
	{
		return new Samsung();
	}
	
	@Bean //to create object of MobileProcessor.
	public MobileProcessor getProcessor()
	{
		return new Snapdragon();
	} 
*/	
	
	/*	we can also create the objects without writing these below lines.--->	
	 * 
	 *	@Bean  //specifying this method as bean hence no need to create a bean in xml file.
	*	public Samsung getPhone()
	*	{
			return new Samsung();
	*	}
	
	*	@Bean //to create object of MobileProcessor.
		public MobileProcessor getProcessor()
	*	{
			return new Snapdragon();
	*	}
	 * 
	 * 
	 * 
	 * instead just write @Component above each class of which you want to make the object  i.e 
	 *   write @Component above Samsung and Snapdragon class in this case.
	 *    and write 
	 *  @ComponentScan(basePackages = "com.bridgelabz.hibernate.SpringAnnotations") above 
	 *  AppCongif class.
	 */
}
