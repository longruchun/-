package cn.jbit.tax.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
	
	
	
	/*
	 * 
	 * static String driver="com.mysql.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/myschool";
    static String user="root";
    static String pwd="root";
	 * 
	 * 
	 * 
	 */
	private static String driver = 
			"com.mysql.jdbc.Driver";// 数据库驱动字符串
	private static String url = 
			"jdbc:mysql://localhost:3306/vehicle_purchase_tax";// 连接URL字符串
	private static String user = "root"; // 数据库用户名
	private static String password = "root"; // 用户密码
	/**
	 * 获取数据库连接对象。
	 */
	public  Connection getConnection() {
		Connection conn = null;// 数据连接对象
		// 获取连接并捕获异常
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();// 异常处理
		}
		return conn;// 返回连接对象
	}
	
	public  void closeAll(Connection conn, Statement stmt, ResultSet rs) {
		// 若结果集对象不为空，则关闭
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 若Statement对象不为空，则关闭
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 若数据库连接对象不为空，则关闭
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
