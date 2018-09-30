package com.lrc.until;

import java.util.List;

public interface IBaseDao<T> {
 int add(T t);
 int update(T t);
 int delete(int id);
	
	List<T>  getAll();
	
}
