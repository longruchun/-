package com.lrc20180917_2;

import java.util.ArrayList;
import java.util.Iterator;

import com.lrc20180915_2.Dog;

public class Test {
   public static void main(String[] args) {
	
	   Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");
		
		ArrayList dogs=new ArrayList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);
		
		System.out.println("����������ʾ���½��:");
		Iterator  it= dogs.iterator();
		while (it.hasNext()) {
			Dog dog = (Dog) it.next();
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
		
		
		
		
		
		
	   
	   
}
}
