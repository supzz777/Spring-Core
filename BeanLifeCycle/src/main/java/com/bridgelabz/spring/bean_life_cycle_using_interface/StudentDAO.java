package com.bridgelabz.spring.bean_life_cycle_using_interface;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentDAO implements  InitializingBean, DisposableBean
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
	
	
	//THIS IS THE INIT() METHOD
	public void afterPropertiesSet() throws Exception 
	{

		System.out.println("Custom init method.");
		getConnection();
		
	}
	
	//method1
	public void getConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating connection for StudentDB");
		//load the driver
		Class.forName(driver); //it adds  some throws declaration
		
		//get the Connection
	   con = DriverManager.getConnection(url,username,password);// it adds  some throws declaration
		
		System.out.println("connection established.");
		
	}//method1 end.
	
	
	
	
	//method2
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
	
	
	
	//method3
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
	
	
	

	//method4
	public void closeConnection() throws SQLException
	{
		
		//closing the connectiom
		con.close();
		System.out.println("Connection closed.");	
		
		
	}//method end.
	
	
	//destroy method.
	public void destroy() throws SQLException
	{
		closeConnection();
	}
	
	
}
