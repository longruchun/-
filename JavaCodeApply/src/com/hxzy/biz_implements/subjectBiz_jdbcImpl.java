package com.hxzy.biz_implements;

import java.util.List;

import com.hxzy.biz_interface.IsubjectBiz;
import com.hxzy.dao_implements.subjectDao_jdbcImpl;
import com.hxzy.dao_interface.IsubjectDao;
import com.hxzy.entity.subject;

public class subjectBiz_jdbcImpl implements IsubjectBiz {

	IsubjectDao dao=new subjectDao_jdbcImpl();
	
	@Override
	public int add(subject t) {
		// TODO Auto-generated method stub
		return dao.add(t);
	}

	@Override
	public int Update(subject t) {
		// TODO Auto-generated method stub
		return dao.Update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<subject> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
