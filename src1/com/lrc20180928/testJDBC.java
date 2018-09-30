package com.lrc20180928;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        String url="jdbc:mysql://localhost:3306/myschool";
        
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
			conn=DriverManager.getConnection(url,"root","root");
			stmt=conn.createStatement();
			
			String sql="select * from student";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				String str=rs.getString("studentNo")+"\t"+rs.getString("studentName")+"\t"+rs.getString("Address");
				System.out.println(str);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
