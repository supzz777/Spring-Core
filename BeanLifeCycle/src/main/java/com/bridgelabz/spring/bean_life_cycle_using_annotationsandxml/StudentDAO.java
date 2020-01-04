package com.bridgelabz.spring.bean_life_cycle_using_annotationsandxml;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class StudentDAO 
{
							//Define the values in beans xml file not here.
	private String driver ;//= "com.mysql.jdbc.Driver";
	private String url ;//= "jdbc:mysql://localhost:3306/supzz777";
	private String username;// = "root";
	private String password;// ="password";

	
	// connection object.
	Connection con;
	
	//for private variables to acess create getters and setters.

	public String getDriver() 
	{
		return driver;
	}

	public void setDriver(String driver)
	{
		System.out.println("setting driver.");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) 
	{  System.out.println("setting url.");
		this.url = url;
	}

	public String getUsername() 
	{
	
		return username;
	}

	public void setUsername(String username) 
	{
		System.out.println("setting user name.");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password)
	{
		System.out.println("setting password.");
		this.password = password;
	}
	
	//@PostConstruct will be called only once in the entire Bean life cycle.
	@PostConstruct			
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("Custom init method.");
		getConnection();
	}
	//method1
	//for this we need javax.annotation dependency.
	/*this annotation tells the spring ..hey spring please invoke/call this method each tym after you
	finish creating the object */ 
	/* this method is init() method for Spring Bean life Cycle. and we dnt need to 
	 * call init method ,our framework will call it for us.
	 * 
	 *              (OR) we can also do this way by creating init method and placing our init method 
	 *     that is our getConnection() method inside it.         
	 *            
	 *              //this is good coding std to follow.
	 *		    @PostConstruct			
				public void init() throws ClassNotFoundException, SQLException
				{
					getConnection();
				}          
	 *              
	 */
	//  @PostConstruct
	public void getConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating connection for StudentDB");
		//load the driver
		Class.forName(driver); //it adds  some throws declaration
		
		//get the Connection
	   con = DriverManager.getConnection(url,username,password);// it adds  some throws declaration
		
		System.out.println("connection established.");
		
	}//method1 end.
	
	
	
	
	//method3
	public void fetchAllRows() throws ClassNotFoundException, SQLException
	{
		
		System.out.println("retreiving all the records from the hostel");
		
 //spring calls @PostConstruct method automatically,no need to call it by ourself ,spring will call
		//getConnection(); //creating the connectionby calling get connection method.
		
		//execute the Query
		Statement smt = con.createStatement();
		
		
		ResultSet rs =smt.executeQuery("select * from supzz777.hostel;");
		
	
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFee = rs.getDouble(3);
			String foodType = rs.getString(4);
			
			
			System.out.println(+studentId+" , "+studentName+" , "+hostelFee+" , "+foodType);
		}
		
 //dont call it spring framework will call this as we have declare this method as @PreDestroy() method.
		//closeConnection();
		
	}//method end.
	
	//method4
	public void deleteRecord() throws ClassNotFoundException, SQLException
	{
		
 //spring calls @PostConstruct method automatically,no need to call it by ourself ,spring will call
		//getConnection();//creating the connection by calling get connection method.
		
		//execute the Query
		Statement smt = con.createStatement();
		
		
		//delete query
		smt.executeUpdate("delete from supzz777.hostel where Student_id = 4;");
		
		System.out.println("deleted the record  from the hostel");
		
		
 //dont call it spring framework will call this as we have declare this method as @PreDestroy() method.
		//closeConnection();
		
		
	}//method end.
	
	
	

	//method2
	public void closeConnection() throws SQLException
	{
		
		//closing the connectiom
		con.close();
		System.out.println("Connection closed.");	
		
		
	}//method end.
	
	
	/*deswtroy() method will be called just before the Bean is removed from the container
	 * Hence use @PreDestroy annotation*/
	//@PreDestroy will be called only once in the entire Bean life cycle.
	@PreDestroy
	public void destroy() throws SQLException
	{
		closeConnection();
	}
}
