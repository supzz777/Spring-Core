package com.bridgelabz.hibernate.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung 
{	
	/*this autowired searches the type of object in configuration class.
   * it mainly checks the returntype of the object created i.e. MobileProcessor in this case. */
	// @Autowired 
	 @Qualifier("mediaTek")
	MobileProcessor cpu;
	
	//getters and setters.
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	
	//method 1.
	public void config()
	
	{
		
		System.out.println("Octa Core, 4GB Ram, 12MP cam");
		cpu.process();
	}
	
	
	/*HEre there are 2 Microprocessors defined i.e. --> snapdragon and microtek.
	* we have not specified which microporocessor we want to our Samsung mobile hence 
	*  the compiler will throw an error. hence use 
	*  @Primary above the class of microprocessor which we want in the output.
	*  
	*  if not use @Qualifier and specify which microprocessor you want.above the MobileProcessor cpu;
	*/
}
