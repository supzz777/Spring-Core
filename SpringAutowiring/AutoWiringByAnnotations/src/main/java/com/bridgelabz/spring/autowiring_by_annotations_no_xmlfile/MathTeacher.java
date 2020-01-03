package com.bridgelabz.spring.autowiring_by_annotations_no_xmlfile;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher 
{
	
	public void teach() 
	{
		System.out.println("teaches maths.");

	}

}
