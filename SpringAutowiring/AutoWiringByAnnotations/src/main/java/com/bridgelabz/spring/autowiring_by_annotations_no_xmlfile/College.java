package com.bridgelabz.spring.autowiring_by_annotations_no_xmlfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("collegeObj") /*@Component creates the object of class College with object name 
as collegeObj..if we dnt specify the bean ID the default name will be class name with small
 letters i.e here it willl be --->  college*/

public class College
{
	@Value (value = "Ac patil College of Engg") /*for primitive data type you cannot use autowired 
												so use @value annotation.*/
	private String collegename;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;
	
	public void rag()
	{
		System.out.println("The name of our College is = "  +collegename );
		principal.PrinciName();
		teacher.teach();
	}
	

}
