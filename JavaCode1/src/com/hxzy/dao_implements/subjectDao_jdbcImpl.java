package com.hxzy.dao_implements;

import java.util.List;

import com.hxzy.dao_interface.IsubjectDao;
import com.hxzy.entity.grade;
import com.hxzy.entity.subject;
import com.hxzy.util.jdbcHelper;

public class subjectDao_jdbcImpl implements IsubjectDao {

	@Override
	public int add(subject t) {
		
		String sql="insert into subject(subjectName,classHource,gradeId) values(?,?,?)";
		Object[] params= {t.getSubjectName(),t.getClassHour(),t.getGradeId()};
		return jdbcHelper.executeUpdate(sql, params);
	}

	@Override
	public int Update(subject t) {
		String sql="update subject set subjectName=?,classHource=?,gradeId=? where subjectNo=?";
		Object[] params= {t.getSubjectName(),t.getClassHour(),t.getGradeId(),t.getSubjectNo()};
		return jdbcHelper.executeUpdate(sql, params);
	}

	@Override
	public int delete(int id) {
		String sql="delete from  subject where subjectNo=?";
		Object[] params= {id};
		return jdbcHelper.executeUpdate(sql, params);
	}

	@Override
	public List<subject> getAll() {
		String sql="select * from subject";
		return  jdbcHelper.executeQuery(sql,null,subject.class);
	}

}
