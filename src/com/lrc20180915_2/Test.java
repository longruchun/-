package com.lrc20180915_2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	System.out.println("ʹ��Iterator����,���й����ĳ��غ�Ʒ�ֱַ���:");
	Iterator it=dogs.iterator();
	
	while (it.hasNext()) {
		Dog dog = (Dog ) it.next();
		System.out.println(dog.getName()+"\t"+dog.getStrain());
		
	}
	
	
	
}
}
