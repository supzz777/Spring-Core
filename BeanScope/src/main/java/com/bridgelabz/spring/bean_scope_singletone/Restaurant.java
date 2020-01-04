package com.bridgelabz.spring.bean_scope_singletone;

public class Restaurant
{
	private String welcomeNote;
	
	//getters and setters
	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	//method1
	public void greetCustomer()
	{
		System.out.println(welcomeNote);
	}
	
	
}
