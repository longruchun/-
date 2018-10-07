package com.lrc.biz_implements;

import java.util.List;

import com.hxzy.biz_interface.IgradeBiz;
import com.hxzy.dao_implements.gradeDao_jdbcImpl;
import com.hxzy.dao_interface.IgradeDao;
import com.hxzy.entity.grade;

public class gradeBiz_jdbcImpl implements IgradeBiz {

	IgradeDao dao=new gradeDao_jdbcImpl();
	
	@Override
	public int add(grade t) {
		// TODO Auto-generated method stub
		return dao.add(t);
	}

	@Override
	public int Update(grade t) {
		// TODO Auto-generated method stub
		return dao.Update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<grade> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
