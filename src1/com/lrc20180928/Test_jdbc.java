package com.lrc20180928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_jdbc {
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
			
			StringBuffer sql=new StringBuffer("insert into student(studentNo,loginpwd,sex,studentName,gradeid,phone,Address,Borndate,email)");
			
            sql.append("values('20160401061','1234','男',1,'1234','小河','1996-04-22','1430468717@qq.com'         )");
            
            int rel=stmt.executeUpdate(sql.toString());
            if (rel==1) {
				System.out.println("插入數據成功");
			} else {
                 System.out.println("插入數據失敗");
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
