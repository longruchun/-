package com.lrc20180917_2;

import java.util.ArrayList;

import com.lrc20180915_2.Dog;

public class Test3 {
	public static void main(String[] args) {
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");
		
		ArrayList<Dog> dog=new ArrayList();//<Dog>��ָ�����ϵ�����
		dog.add(feifeiDog);
		dog.add( yayaDog);
		dog.add(meimeiDog);
		dog.add(ououDog);
		
		
		
	}
	  
}
