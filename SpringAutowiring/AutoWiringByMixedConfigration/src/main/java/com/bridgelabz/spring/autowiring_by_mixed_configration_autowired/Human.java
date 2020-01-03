package com.bridgelabz.spring.autowiring_by_mixed_configration_autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human 
{
		// @Autowired //(by type) /* autowire first checks for the by type then goes for by name*/
		//private Heart heartObj;
		
		@Autowired //(by name)
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
				heart.pumping();
			else
			{
				System.out.println("Heart dead");
			}
			
		}
		

}
