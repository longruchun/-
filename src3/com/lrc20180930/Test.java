package com.lrc20180930;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/*
	 * ������Ԫ�ؼ��뵽���в������Ͱ�ȫ�ģ�
Collection<?> c = new ArrayList<String>();
c.add(new Object()); // ����ʱ����
��Ϊ���ǲ�֪��c��Ԫ�����ͣ����ǲ�����������Ӷ���
        add���������Ͳ���E��Ϊ���ϵ�Ԫ�����͡����Ǵ���add���κβ�����������һ��δ֪���͵����ࡣ��Ϊ���ǲ�֪������ʲô���ͣ����������޷����κζ�����ȥ��
Ψһ���������null�������������͵ĳ�Ա��

��һ���棬���ǿ��Ե���get()������ʹ���䷵��ֵ������ֵ��һ��δ֪�����ͣ���������֪����������һ��Object

	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		List<?> list = null;
		list = new ArrayList<String>();
		list = new ArrayList<Double>();
		//list.add(3);
		list.add(null);

		List<String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		//l1.add(null,��wyl");"
		l2.add(15);
		read(l1);
		read(l2);  }
		static void read(List<?> list){
			for(Object o : list){
				System.out.println(o);
		}  
	}
	
	
	
	
}
