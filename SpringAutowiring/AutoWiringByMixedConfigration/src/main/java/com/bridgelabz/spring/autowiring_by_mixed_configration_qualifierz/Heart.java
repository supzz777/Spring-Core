package com.bridgelabz.spring.autowiring_by_mixed_configration_qualifierz;

import org.springframework.stereotype.Component;


public class Heart
{
	/*autowire is not for the primitive data type because how would spring know which type of data 
	 * we want to enter whether int or string., *  so we have used property tag in xml file.*/
	private String nameOfAnimal;
	private int noOfHeart;
	
	

	//setters and getters
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}
	
	
	
	//method1.
	public void pumping()
	{
		System.out.println("Heart is Pumping.");
		System.out.println("Alive");
	}


}
