package com.lrcgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcHelper {
   
	static Connection conn=null;
	static String driver="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/myschool";
static {
		
		try {
			Class.forName(driver);
			System.out.println("被执行后以后就不在被执行了");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	static Connection getConnection() throws SQLException {
		if(conn!=null) {
			return conn;
		}else {
			conn=DriverManager.getConnection(url,"root","root");
			return conn;
		}
	}
	
	static void closeConnection() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
	
	static List execute(String sql,Object[] params,boolean isQuery) {
		List list=new ArrayList(); 
		int rel=0;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List grade_list=new ArrayList();
		try {
			pstmt=getConnection().prepareStatement(sql);
			
			if(params!=null) {
				for(int i=0;i<=params.length-1;i++) {
				   pstmt.setObject((i+1),params[i]);
				}
			}
			
			if (!isQuery) {
				rel = pstmt.executeUpdate();
			}else {//isQuery 为真，是执行查询
				rs=pstmt.executeQuery();
				
				
				while(rs.next()) {
					grade gr=new grade(rs.getInt("gradeid"),rs.getString("gradeName"));
					grade_list.add(gr);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		list.add(rel);
		list.add(grade_list);
		
		return list;
	}
}
