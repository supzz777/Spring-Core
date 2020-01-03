package com.bridgelabz.spring.creating_bean_inside_configclass;

//import org.springframework.stereotype.Component;

//@Component (no need of annotations as we are creating beans in the configuration class).
public class College {
	private Principal principal;
	
	//setters and getters.
	public Principal getPrincipal() {
		return principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	/*  //creating constructor using field to inject bean principal into the college bean.
	public College(Principal principal)
	{
		this.principal = principal;
	}
		*/
	
	
	//method1.
	public void test()
	{
		System.out.println("test method is being called.");
		principal.strict();
	}

}
