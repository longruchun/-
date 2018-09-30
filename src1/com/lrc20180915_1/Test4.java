package com.lrc20180915_1;

import java.util.LinkedList;

public class Test4 {
   public static void main(String[] args) {
	
	   Dog dog=new Dog("小黑","土狗");
		Dog dog2=new Dog("小红","雪橇");
		Dog dog3=new Dog("小白","土狗");
		Dog dog4=new Dog("小绿","雪橇");
		
	LinkedList< Dog> dogs=new 	LinkedList();
	 dogs.add(dog3);
	 dogs.add(dog2);
	 dogs.addLast(dog);//在末尾添加
	 dogs.addFirst(dog4);;//在页首添加
	 
	 Dog first_dog_name=(Dog)dogs.getFirst();
	 System.out.println("第一条狗的称呢是"+first_dog_name.getName());
	 
	 Dog last_dog_name=(Dog)dogs.getLast();
	 System.out.println("最后一条狗的称呢是"+last_dog_name.getName());
	 dogs.removeFirst();
	 dogs.removeLast();
	 
	 System.out.println("删除后还有"+dogs.size()+"条狗狗");
     System.out.println("分别是");	 
     
	   for (int i = 0; i < dogs.size(); i++) {
		   
		   Dog dog7=(Dog)dogs.get(i);
		   System.out.println(dog7.getName()+"\t"+dog7.getStrain());
		    
		   
		   
		
	}
     
	   
	   
	   
}
}
