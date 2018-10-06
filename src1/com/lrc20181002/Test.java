package com.lrc20181002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Test {
 
	
	private static Logger logger=Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Connection conn=null;
		//1,加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//2建立连接
		 String  url="jdbc:mysql://localhost:3306/items?useUnicode=true&charseterEncoding=UTF-8";
	     String  user="root";
	     String  password="1234";
	     
	     try {
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("建立连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if (null!=conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("连接关闭成功");
			}
			
			
			
		}
	     
		
	}

}
