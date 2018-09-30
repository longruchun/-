package com.lrc20180917_1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
  public static void main(String[] args) {
	Map map=new HashMap();
	  Dog dog1=new Dog("小黑","狼狗");
	  
	  map.put("小黑", dog1);
	  Dog dog2=new Dog("小花","狼狗");
	  map.put("小花", dog2);
	  
	  
	  Dog dog3=new Dog("嘿嘿","土狗");
	  map.put("嘿嘿", dog3);
	  Dog dog4=new Dog("花花","藏獒");
	  map.put("花花", dog4);
	  
	  
	  System.out.println("狗狗的数量是"+map.size()+"条");
	  System.out.println("分别是:");
	  for(Object key:map.keySet()) {
		  
		  System.out.println(key);
		  
	  }
	  System.out.println("删除前:");
	  if (map.containsKey("小黑")) {
		System.out.println("有小黑");
	}else {
		
		System.out.println("没有小黑");
	}
	  
	  map.remove("小黑");
	  System.out.println("删除后:");
	  if (map.containsKey("小黑")) {
			System.out.println("有小黑");
		}else {
			
			System.out.println("没有小黑");
		}
	  
}
}
