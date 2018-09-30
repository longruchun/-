package com.lrc20180930;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/*
	 * 将任意元素加入到其中不是类型安全的：
Collection<?> c = new ArrayList<String>();
c.add(new Object()); // 编译时错误
因为我们不知道c的元素类型，我们不能向其中添加对象。
        add方法有类型参数E作为集合的元素类型。我们传给add的任何参数都必须是一个未知类型的子类。因为我们不知道那是什么类型，所以我们无法传任何东西进去。
唯一的例外的是null，它是所有类型的成员。

另一方面，我们可以调用get()方法并使用其返回值。返回值是一个未知的类型，但是我们知道，它总是一个Object

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
		//l1.add(null,“wyl");"
		l2.add(15);
		read(l1);
		read(l2);  }
		static void read(List<?> list){
			for(Object o : list){
				System.out.println(o);
		}  
	}
	
	
	
	
}
