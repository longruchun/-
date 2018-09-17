package com.lrc20180917_2;

import java.util.ArrayList;

import com.lrc20180915_2.Dog;

public class Test3 {
	public static void main(String[] args) {
		Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
		
		ArrayList<Dog> dog=new ArrayList();//<Dog>是指定集合的类型
		dog.add(feifeiDog);
		dog.add( yayaDog);
		dog.add(meimeiDog);
		dog.add(ououDog);
		
		
		
	}
	  
}
