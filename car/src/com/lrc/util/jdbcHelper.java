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
    
    /**
       * 封装jdbc原生的executeUpdate 方法,只用于进行增、删、改
       * @param sql :要执行的sql语句
       * @param params:语句中的参数
       * @return  :表明语句对象的执行，最终影响到数据表中的多少行，大于0说明语句执行成功
     */
   public static int executeUpdate(String sql,Object[] params) {
    	int val=0;
    	
    	//通过传入的sql,获得语句对象
    	try {
			pstmt=getConn().prepareStatement(sql);
			
			//如果params 不为空，将参数列表中的参数（此处是个对象数组），添加给语句对象
			if(params!=null) {
	    		for(int i=0;i<params.length;i++) {
	    			pstmt.setObject((i+1),params[i]);
	    		}
	    	}
			
			//执行语句，记录返回值
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
        * 封装jdbc 原生executeQuery 方法，执行查询语句，返回结果集，此处我们用泛型 集合返回
        * @param  Class<T>  对应的实体类的类型 例如: grade.class,subject.class
     * @return 对应实体类类型 的泛型集合
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     */
    public static<T> List<T> executeQuery(String sql,Object[] params,Class<T> clazz){
    	List<T> list=new ArrayList<T>();
    	
    	//通过传入的sql,获得语句对象
    	try {
			pstmt=getConn().prepareStatement(sql);
			
			//如果params 不为空，将参数列表中的参数（此处是个对象数组），添加给语句对象
			if(params!=null) {
	    		for(int i=0;i<params.length;i++) {
	    			pstmt.setObject((i+1),params[i]);
	    		}
	    	}
			
			//执行语句，返回结果集
			rs=pstmt.executeQuery();
			
			//获取结果集的metadata---用它就可以探测一个结果集中的信息,比如，有多少列，列名称是什么等等
			ResultSetMetaData rsmd=rs.getMetaData();
			//获取线结果集中的列数
			int columns=rsmd.getColumnCount();
			//构造循环，遍历所有行
			while(rs.next()) {
				//对于每一行数据， 我们要实例 化一个泛型的对象
				T t=clazz.newInstance();
				//遍历所有列
				for(int i=0;i<columns;i++) {
					String columnName=rsmd.getColumnName(i+1);
					Object columnValue=rs.getObject(i+1);
					//以下这句相当于给泛型对象赋值
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
