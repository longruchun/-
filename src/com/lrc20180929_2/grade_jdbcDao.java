package com.lrc20180929_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class grade_jdbcDao implements Igrade {

	@Override
	public int add(grade ga) {
		
		List list=null;
		
		String sql="insert into grade(gradeName) values(?)";
		Object[] params= {ga.getGradeName()};
		
		list=jdbcHelper.execute(sql, params,false);
		if((int)list.get(0)>0) {
			System.out.println("插入成功");
		}else {
			System.out.println("插入失败");
		}
	
		return (int)list.get(0);
	}

	@Override
	public int update(grade ga) {
        
		String sql="update grade set gradeName=? where gradeid=?";
		Object[] params= {ga.getGradeName(),ga.getGradeid()};
		
		List list=jdbcHelper.execute(sql, params,false);
		if((int)list.get(0)>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
	
		return (int)list.get(0);
	}

	@Override
	public int delete(int gradeid) {
        
		String sql="delete from grade where gradeid=?";
		Object[] params= {gradeid};
		
		List list=jdbcHelper.execute(sql, params,false);
		if((int)list.get(0)>0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	
		return (int)list.get(0);
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		String sql="select * from grade";
		
		List list=jdbcHelper.execute(sql,null,true);
		return list;
		
	}

	
}
