package com.bridgelabz.spring.autowiring_by_mixed_configration_qualifierz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
		
		@Autowired 
		//@Qualifier("humanHeartObj") //specifying which heart we want human or octopus.
		@Qualifier("octopusHeartObj") //specifying which heart we want human or octopus.
		private Heart heart;
		
		private String name;
		 
		
		
		public Heart getHeart() {
			return heart;
		}

		public void setHeart(Heart heart) {
			this.heart = heart;
		}
		
		

		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		//method1.
		public void StartPumping()
		{
			if(heart != null)
			{
			heart.pumping();
			System.out.println("name of the animal = "+heart.getNameOfAnimal()+
							"\nnumber of heart present = "+heart.getNoOfHeart());
			}
			else
			{
				System.out.println("Heart dead");
			}
			
		}
		

}
