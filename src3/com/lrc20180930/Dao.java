package com.lrc20180930;

import java.util.Collection;

public class Dao {
	/*
	 * 泛型的格式是:
	 * [访问权限]<泛型>返回类型  方法名([泛型标识参数名称])抛出异常
	 * 
	 * 
	 * 
	 */
	public<E> E get(int id,E e) {
	
		
		E result =null;
		 return  result; 
		
		
	}
	
	
	static <T> void fromArrayToCollection(T[] a,Collection<T> c) {
		
		
		for(T o:a) {
			
			
			
			c.add(o);
		}
		
		
		
		
	}
	
	
	
	
}
