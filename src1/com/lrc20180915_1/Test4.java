package com.lrc20180915_1;

import java.util.LinkedList;

public class Test4 {
   public static void main(String[] args) {
	
	   Dog dog=new Dog("С��","����");
		Dog dog2=new Dog("С��","ѩ��");
		Dog dog3=new Dog("С��","����");
		Dog dog4=new Dog("С��","ѩ��");
		
	LinkedList< Dog> dogs=new 	LinkedList();
	 dogs.add(dog3);
	 dogs.add(dog2);
	 dogs.addLast(dog);//��ĩβ���
	 dogs.addFirst(dog4);;//��ҳ�����
	 
	 Dog first_dog_name=(Dog)dogs.getFirst();
	 System.out.println("��һ�����ĳ�����"+first_dog_name.getName());
	 
	 Dog last_dog_name=(Dog)dogs.getLast();
	 System.out.println("���һ�����ĳ�����"+last_dog_name.getName());
	 dogs.removeFirst();
	 dogs.removeLast();
	 
	 System.out.println("ɾ������"+dogs.size()+"������");
     System.out.println("�ֱ���");	 
     
	   for (int i = 0; i < dogs.size(); i++) {
		   
		   Dog dog7=(Dog)dogs.get(i);
		   System.out.println(dog7.getName()+"\t"+dog7.getStrain());
		    
		   
		   
		
	}
     
	   
	   
	   
}
}
