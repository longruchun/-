package com.lrc.dao_implements;

import java.util.List;

import com.hxzy.dao_interface.IgradeDao;
import com.hxzy.entity.grade;
import com.hxzy.util.jdbcHelper;

public class gradeDao_jdbcImpl implements IgradeDao {

	@Override
	public int add(grade t) {
		
		String sql="insert into grade(gradeName) values(?)";
		Object[] params= {t.getGradeName()};
		return jdbcHelper.executeUpdate(sql, params);

	}

	@Override
	public int Update(grade t) {
		String sql="update grade set gradeName=? where gradeId=?";
		Object[] params= {t.getGradeName(),t.getGradeId()};
		return jdbcHelper.executeUpdate(sql, params);
	}

	@Override
	public int delete(int id) {
		String sql="delete from grade where gradeId=?";
		Object[] params= {id};
		return jdbcHelper.executeUpdate(sql, params);
	}

	@Override
	public List<grade> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from grade";
		return  jdbcHelper.executeQuery(sql,null,grade.class);
	}

}
