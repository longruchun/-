package com.lrc.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

public class jdbcHelper {
    static String driver="com.mysql.jdbc.Driver";
    static String url="jdbc:mysql://localhost:3306/vehiclePurchase";
    static String user="root";
    static String pwd="root";
    
    static Connection conn=null;
    static PreparedStatement pstmt=null;
    static ResultSet rs=null;
    
    
    static {
    	try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
        * 获取连接对象
     * @return
     * @throws SQLException
     */
    static Connection getConn() throws SQLException {
    	if(conn!=null) {
    		return conn;
    	}else {
    		return DriverManager.getConnection(url,user,pwd);
    	}
    }
    
    /**
      *  统一关闭需要关闭的对象
     */
    static void closeAll() {
    	if(rs!=null) {
			try {
				rs.close();
				rs=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pstmt!=null){
			try {
				pstmt.close();
				pstmt=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn!=null) {
			try {
				conn.close();
				conn=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
    
   public static int executeUpdate(String sql,Object[] params) {
    	int val=0;
    	
    	try {
			pstmt=getConn().prepareStatement(sql);
			
			if(params!=null) {
	    		for(int i=0;i<params.length;i++) {
	    			pstmt.setObject((i+1),params[i]);
	    		}
	    	}
			
			val=pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
    	
    	
    	
    	return val;
    }
   
    public static<T> List<T> executeQuery(String sql,Object[] params,Class<T> clazz){
    	List<T> list=new ArrayList<T>();
    	
    	try {
			pstmt=getConn().prepareStatement(sql);
			
			if(params!=null) {
	    		for(int i=0;i<params.length;i++) {
	    			pstmt.setObject((i+1),params[i]);
	    		}
	    	}
			rs=pstmt.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int columns=rsmd.getColumnCount();
			while(rs.next()) {
				T t=clazz.newInstance();
				for(int i=0;i<columns;i++) {
					String columnName=rsmd.getColumnName(i+1);
					Object columnValue=rs.getObject(i+1);
					PropertyUtils.setProperty(t,columnName,columnValue);
				}
				
				list.add(t);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll();
		}
    	
    	return list;
    }
}
