package com.bridgelabz.spring.bean_life_cycle;

import java.sql.SQLException;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
	
	StudentDAO d = new StudentDAO();
	d.fetchAllRows(); //it adds the throws declaration around the main method.
	d.deleteRecord();
	
	}

}
