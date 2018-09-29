import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcHelper {
   
	static String driver="com.mysql.jdbc.Driver";
	static Connection conn=null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;
	
	static String url="jdbc:mysql://localhost:3306/myschool";
	
	static {
	   try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	   
	static Connection getConnection() {
		if(conn!=null) {
			return conn;
		}else {
			try {
				conn=DriverManager.getConnection(url,"root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
	}
	
	
	static void closeAll() {
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
				conn=null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static List executeSql(String sql,Object[] params,boolean isQuery) {
        int rel=0;
		
		List list=new ArrayList();
		List grade_list=new ArrayList();
		try {
			pstmt=conn.prepareStatement(sql);
			
			if(params!=null) {
				for(int i=0;i<params.length;i++) {
					pstmt.setObject((i+1),params[i]);
				}
			}
			
			if(isQuery) {//执行查询语句
			    rs=pstmt.executeQuery();
			    
			    //将rs 结果集游标封装为一个grade对象数组
			    while(rs.next()) {
			    	grade gr=new grade(rs.getInt("gradeid"),rs.getString("gradeName"));
			    	grade_list.add(gr);
			    }
	            list.add(rel);
	            list.add(grade_list);
			}else {//执行增删改
				rel=pstmt.executeUpdate();
				
				 list.add(rel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}

		return list;
		
	} 
}
    

