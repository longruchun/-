package com.lrc20180928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_jdbc3 {
	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
      
		Connection conn=null;
		Statement  stmt=null;
		ResultSet rs=null;
		
		try {
			String url="jdbc:mysql://localhost:3306/myschool";
			conn=DriverManager.getConnection(url, "root", "root");//链接到数据库
            stmt=conn.createStatement();
			
			String sql="select * from student";
			rs=stmt.executeQuery(sql);
			
		    while (rs.next()) {
		    	String str=rs.getString("studentNo")+"\t"+rs.getString("studentName")+"\t"+rs.getString("Address");
				System.out.println(str);
				
			}
		    
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	}
	
}
