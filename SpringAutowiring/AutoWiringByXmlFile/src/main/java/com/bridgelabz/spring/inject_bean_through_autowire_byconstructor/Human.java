package com.bridgelabz.spring.inject_bean_through_autowire_byconstructor;


public class Human 
{		
		
		private Heart heartObj;
		
		private String name;

		
		
		//constructor using feild.
		public Human(Heart heartObj)
		{
			//super();
			this.heartObj = heartObj;
			System.out.println("constructor using feild method is being called.");
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
