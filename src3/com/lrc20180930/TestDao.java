package com.lrc20180930;

import java.util.ArrayList;
import java.util.Collection;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Object[] ao=new Object[100];//创建一个对象数组
		Collection<Object> co=new ArrayList<Object>();
		fromArrayToCollection(ao,co);
        
		String[] sa=new String[20];
		Collection<String> cs=new ArrayList<>();
		fromArrayToCollection(sa,cs);
		
		Collection<Double> cd =new ArrayList<>();
		
		fromArrayToCollection(sa,co);*/
		
		Object[] ao = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		fromArrayToCollection(ao, co);

		String[] sa = new String[20];
		Collection<String> cs = new ArrayList<>();
		fromArrayToCollection(sa, cs);

		Collection<Double> cd = new ArrayList<>();
		// 下面代码中T是Double类，但sa是String类型，编译错误。
		// fromArrayToCollection(sa, cd);
		// 下面代码中T是Object类型，sa是String类型，可以赋值成功。
		fromArrayToCollection(sa, co);  }

	private static void fromArrayToCollection(String[] sa, Collection<String> cs) {
		// TODO Auto-generated method stub
		
	}

	private static void fromArrayToCollection(Object[] ao, Collection<Object> co) {
		// TODO Auto-generated method stub
		
	}

		
	}

	


