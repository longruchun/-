package com.lrc20180917_1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
  public static void main(String[] args) {
	Map map=new HashMap();
	  Dog dog1=new Dog("С��","�ǹ�");
	  
	  map.put("С��", dog1);
	  Dog dog2=new Dog("С��","�ǹ�");
	  map.put("С��", dog2);
	  
	  
	  Dog dog3=new Dog("�ٺ�","����");
	  map.put("�ٺ�", dog3);
	  Dog dog4=new Dog("����","����");
	  map.put("����", dog4);
	  
	  
	  System.out.println("������������"+map.size()+"��");
	  System.out.println("�ֱ���:");
	  for(Object key:map.keySet()) {
		  
		  System.out.println(key);
		  
	  }
	  System.out.println("ɾ��ǰ:");
	  if (map.containsKey("С��")) {
		System.out.println("��С��");
	}else {
		
		System.out.println("û��С��");
	}
	  
	  map.remove("С��");
	  System.out.println("ɾ����:");
	  if (map.containsKey("С��")) {
			System.out.println("��С��");
		}else {
			
			System.out.println("û��С��");
		}
	  
}
}
