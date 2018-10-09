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
    static String url="jdbc:mysql://localhost:3306/myschool";
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
        * ��ȡ���Ӷ���
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
      *  ͳһ�ر���Ҫ�رյĶ���
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
    
    /**
       * ��װjdbcԭ����executeUpdate ����,ֻ���ڽ�������ɾ����
       * @param sql :Ҫִ�е�sql���
       * @param params:����еĲ���
       * @return  :�����������ִ�У�����Ӱ�쵽���ݱ��еĶ����У�����0˵�����ִ�гɹ�
     */
   public static int executeUpdate(String sql,Object[] params) {
    	int val=0;
    	
    	//ͨ�������sql,���������
    	try {
			pstmt=getConn().prepareStatement(sql);
			
			//���params ��Ϊ�գ��������б��еĲ������˴��Ǹ��������飩����Ӹ�������
			if(params!=null) {
	    		for(int i=0;i<params.length;i++) {
	    			pstmt.setObject((i+1),params[i]);
	    		}
	    	}
			
			//ִ����䣬��¼����ֵ
			val=pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
    	
    	
    	
    	return val;
    }
    /**
        * ��װjdbc ԭ��executeQuery ������ִ�в�ѯ��䣬���ؽ�������˴������÷��� ���Ϸ���
        * @param  Class<T>  ��Ӧ��ʵ��������� ����: grade.class,subject.class
     * @return ��Ӧʵ�������� �ķ��ͼ���
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     */
    public static<T> List<T> executeQuery(String sql,Object[] params,Class<T> clazz){
    	List<T> list=new ArrayList<T>();
    	
    	//ͨ�������sql,���������
    	try {
			pstmt=getConn().prepareStatement(sql);
			
			//���params ��Ϊ�գ��������б��еĲ������˴��Ǹ��������飩����Ӹ�������
			if(params!=null) {
	    		for(int i=0;i<params.length;i++) {
	    			pstmt.setObject((i+1),params[i]);
	    		}
	    	}
			
			//ִ����䣬���ؽ����
			rs=pstmt.executeQuery();
			
			//��ȡ�������metadata---�����Ϳ���̽��һ��������е���Ϣ,���磬�ж����У���������ʲô�ȵ�
			ResultSetMetaData rsmd=rs.getMetaData();
			//��ȡ�߽�����е�����
			int columns=rsmd.getColumnCount();
			//����ѭ��������������
			while(rs.next()) {
				//����ÿһ�����ݣ� ����Ҫʵ�� ��һ�����͵Ķ���
				T t=clazz.newInstance();
				//����������
				for(int i=0;i<columns;i++) {
					String columnName=rsmd.getColumnName(i+1);
					Object columnValue=rs.getObject(i+1);
					//��������൱�ڸ����Ͷ���ֵ
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
