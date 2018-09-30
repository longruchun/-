package com.lrc20180929;

import java.util.List;

public class Grade_jdbcDao implements Igrade {

	@Override
	public int add(Grade ga) {//Ôö¼Ó
	  List list=null;
	  String  sql="insert into grade(gradeName) values(?) ";
	  //Object[] params= {sql,params,false}; 
		
		
		
		
		
		
		return 0;
	}

	@Override
	public int update(Grade ga) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int gradeid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
