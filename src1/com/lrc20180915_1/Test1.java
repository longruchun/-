package com.lrc20180915_1;

import java.awt.List;
import java.util.ArrayList;

public class Test1 {
     
	public static void main(String[] args) {
		//�����ĸ�����
		Dog dog=new Dog("С��","����");
		Dog dog2=new Dog("С��","ѩ��");
		Dog dog3=new Dog("С��","����");
		Dog dog4=new Dog("С��","ѩ��");
		//����ArrayList���϶��������Ķ�����������
		ArrayList  dogs=new ArrayList();//
		dogs.add(dog);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(2,dog4);//���dog4��ָ��λ��
		System.out.println("����"+dogs.size()+"����");
		//ͨ��ѭ�����������������Ϣ
		System.out.println("�ֱ���:");
		for (int i = 0; i < dogs.size(); i++) {
			
			Dog dog6=(Dog) dogs.get(i);
			
			System.out.println(dog.getName()+"\t"+dog.getStrain());
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
