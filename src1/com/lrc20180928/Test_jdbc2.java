package com.lrc20180928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test_jdbc2 {
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
			conn=DriverManager.getConnection(url, "root", "root");//���ӵ����ݿ�
            /*stmt=conn.createStatement();
			
			String sql="select * from student";
			rs=stmt.executeQuery(sql);
			
		    while (rs.next()) {
		    	String str=rs.getString("studentNo")+"\t"+rs.getString("studentName")+"\t"+rs.getString("Address");
				System.out.println(str);
				
			}*/
			stmt=conn.createStatement();
			Scanner input=new Scanner(System.in);
			System.out.println("���������Ñ�����");
			String name=input.next();
			
			System.out.println("���������Ñ��ܴa");
			String pwd=input.next();
			
			
			String sql="select*from student where  StudentName='" +name+"'and Loginpwd='"+pwd+"'";
			rs=stmt.executeQuery(sql);
			if (rs.next()) {
				System.out.println("��䛳ɹ�");
			} else {
                System.out.println("���ʧ��");
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
