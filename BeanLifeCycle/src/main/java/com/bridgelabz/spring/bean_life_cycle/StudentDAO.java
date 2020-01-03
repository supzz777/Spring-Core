package com.bridgelabz.spring.bean_life_cycle;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO 
{
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/supzz777";
	private String username = "root";
	private String password ="password";

	public void fetchAllRows() throws ClassNotFoundException, SQLException
	{
		//load the driver
		Class.forName(driver); //it adds  some throws declaration
		
		//get the Connection
		Connection con = DriverManager.getConnection(url,username,password);// it adds  some throws declaration
		
		
		
		//execute the Query
		Statement smt = con.createStatement();
		
		
		ResultSet rs =smt.executeQuery("select * from supzz777.hostel;");
		
		System.out.println("retreiving all the records from the hostel");
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFee = rs.getDouble(3);
			String foodType = rs.getString(4);
			
			
			System.out.println(+studentId+" , "+studentName+" , "+hostelFee+" , "+foodType);
		}
		
		//closing the connectiom
		con.close();
		
	}//method end.
	
	public void deleteRecord() throws ClassNotFoundException, SQLException
	{
		
		//load the driver
		Class.forName(driver); //it adds  some throws declaration
		
		//get the Connection
		Connection con = DriverManager.getConnection(url,username,password);// it adds  some throws declaration
		
		
		
		//execute the Query
		Statement smt = con.createStatement();
		
		
	
		
		//delete query
		smt.executeUpdate("delete from supzz777.hostel where Student_id = 4;");
		
		System.out.println("deleted the record  from the hostel");
		

		//closing the connectiom
		con.close();
		
		
	}
	

}
