package com.lrc20180917_2;

import java.util.ArrayList;
import java.util.Iterator;

import com.lrc20180915_2.Dog;

public class Test {
   public static void main(String[] args) {
	
	   Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		ArrayList dogs=new ArrayList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);
		
		System.out.println("便利数组显示如下结果:");
		Iterator  it= dogs.iterator();
		while (it.hasNext()) {
			Dog dog = (Dog) it.next();
			System.out.println(dog.getName()+"\t"+dog.getStrain());
		}
		
		
		
		
		
		
	   
	   
}
}
