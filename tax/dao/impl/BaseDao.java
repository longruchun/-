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
			"com.mysql.jdbc.Driver";// ���ݿ������ַ���
	private static String url = 
			"jdbc:mysql://localhost:3306/vehicle_purchase_tax";// ����URL�ַ���
	private static String user = "root"; // ���ݿ��û���
	private static String password = "root"; // �û�����
	/**
	 * ��ȡ���ݿ����Ӷ���
	 */
	public  Connection getConnection() {
		Connection conn = null;// �������Ӷ���
		// ��ȡ���Ӳ������쳣
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();// �쳣����
		}
		return conn;// �������Ӷ���
	}
	
	public  void closeAll(Connection conn, Statement stmt, ResultSet rs) {
		// �����������Ϊ�գ���ر�
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ��Statement����Ϊ�գ���ر�
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// �����ݿ����Ӷ���Ϊ�գ���ر�
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
