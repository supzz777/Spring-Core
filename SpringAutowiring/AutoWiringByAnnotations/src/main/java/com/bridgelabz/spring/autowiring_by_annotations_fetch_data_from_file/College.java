package com.bridgelabz.spring.autowiring_by_annotations_fetch_data_from_file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("collegeObj") /*@Component creates the object of class College with object name 
as collegeObj..if we dnt specify the bean ID the default name will be class name with small
 letters i.e here it willl be --->  college*/

public class College
{
	@Value ("${college.Name}") /*for primitive data type you cannot use autowired 
												so use @value annotation.*/
	private String collegename;
	
	//setter and getter of collegename.
	
	public String getCollegename() {
		return collegename;
	}
	
	@Required /* if we dont want our object to be null we can use @Required annotation
						.i.e you have to provide the value for the object */
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

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
