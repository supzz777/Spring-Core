package com.bridgelabz.spring.autowiring_by_annotations_no_xmlfile;

import org.springframework.stereotype.Component;

@Component
public class Principal
{
	public void PrinciName()
	{
		System.out.println("I am Principal of your school. ");
		System.out.println("My name is Joseph");
	}

}
