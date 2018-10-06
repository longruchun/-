package com.lrc20181002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.lrc201801912_1.Test;


public class Test1 {
     private  static Logger logger =Logger.getLogger(Test.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection  conn=null;
		//1加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String    url="jdbc:mysql://localhost:3306/items?useUnicode=true&charseterEncoding=UTF-8";
		String   user="root";
		String   password="1234";
		
		//2,建立连接
 		try {
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//关闭连接
			if (null!=conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
		}
 		
 		
 		
		
 		
		
	}

}
