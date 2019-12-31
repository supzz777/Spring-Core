package com.bridgelabz.hibernate.SpringAnnotations;

import org.springframework.stereotype.Component;

 @Component
public class Snapdragon implements MobileProcessor 
{
	
	//implemented method.
	public void process() 
	{
		System.out.println("World's Best CPU");

	}

}
