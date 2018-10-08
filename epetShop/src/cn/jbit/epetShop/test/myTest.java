package cn.jbit.epetShop.test;

import java.sql.Connection;
import java.sql.SQLException;

import cn.jbit.epetShop.dao.BaseDao;

public class myTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Connection conn=null;
		try {
			conn = (new BaseDao()).getConn();
			conn.setAutoCommit(false);
			
		    //运行自已的一系列sql 语句
			conn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
        
       
	}

}
