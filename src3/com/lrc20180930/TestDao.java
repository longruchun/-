package com.lrc20180930;

import java.util.ArrayList;
import java.util.Collection;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Object[] ao=new Object[100];//����һ����������
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
		// ���������T��Double�࣬��sa��String���ͣ��������
		// fromArrayToCollection(sa, cd);
		// ���������T��Object���ͣ�sa��String���ͣ����Ը�ֵ�ɹ���
		fromArrayToCollection(sa, co);  }

	private static void fromArrayToCollection(String[] sa, Collection<String> cs) {
		// TODO Auto-generated method stub
		
	}

	private static void fromArrayToCollection(Object[] ao, Collection<Object> co) {
		// TODO Auto-generated method stub
		
	}

		
	}

	


