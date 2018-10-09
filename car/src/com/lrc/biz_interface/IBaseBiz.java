package com.lrc.biz_interface;

import java.util.List;

public interface IBaseBiz<T> {
	   int add(T t);
	   int Update(T t);
	   int delete(int id);
	   
	   List<T> getAll();
}
