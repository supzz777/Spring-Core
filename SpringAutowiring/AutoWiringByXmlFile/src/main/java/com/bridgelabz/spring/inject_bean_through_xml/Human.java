package com.bridgelabz.spring.inject_bean_through_xml;


public class Human 
{		
		
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
