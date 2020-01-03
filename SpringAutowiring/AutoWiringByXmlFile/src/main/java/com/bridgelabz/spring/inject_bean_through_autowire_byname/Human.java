package com.bridgelabz.spring.inject_bean_through_autowire_byname;


public class Human 
{		
		
		private Heart heartObj;
		
		private String name;

		public Heart getHeartObj() {
			return heartObj;
		}

		public void setHeartObj(Heart heartObj) {
			this.heartObj = heartObj;
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
			if(heartObj != null)
			heartObj.pumping();
			else
			{
				System.out.println("Heart dead");
			}
			
		}

		

}
