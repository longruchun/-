package com.lrc20180915_1;

import java.awt.List;
import java.util.ArrayList;

public class Test1 {
     
	public static void main(String[] args) {
		//创建四个对象
		Dog dog=new Dog("小黑","土狗");
		Dog dog2=new Dog("小红","雪橇");
		Dog dog3=new Dog("小白","土狗");
		Dog dog4=new Dog("小绿","雪橇");
		//建立ArrayList集合对象把上面的对象存放在里面
		ArrayList  dogs=new ArrayList();//
		dogs.add(dog);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(2,dog4);//添加dog4到指定位置
		System.out.println("共有"+dogs.size()+"条狗");
		//通过循环遍历输出狗狗的信息
		System.out.println("分别是:");
		for (int i = 0; i < dogs.size(); i++) {
			
			Dog dog6=(Dog) dogs.get(i);
			
			System.out.println(dog.getName()+"\t"+dog.getStrain());
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
