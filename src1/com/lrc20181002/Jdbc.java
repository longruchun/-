package com.lrc20181002;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc {
   
	
	public  void testDriver() throws SQLException {
		
		//add to build path
		Driver driver= new   com.mysql.jdbc.Driver();
		
		String  url="";
		Properties info=new Properties();
		Connection  connection=   driver.connect(url, info);
		System.out.println(connection);
		
		
		
	}
	
	
	
	
	
	

}
