package com.lrc20180905;

public class Dog1 {


	 private   String name="û������";
	 private   int health=100;
	 private   int love=0;
	 private   String strain="�ǹ�";

	
	 public String getname() {
		 
		 return name;
	 }
	
	public void setName(String name) {
		this.name=name;
		
		
		
		
	}
	
	
	public int getHealth() {
		
		return health;
		
		
	}
	
	
	public void setHealth() {
		
		if (health>100||health<0) {
			
			this.health=40;
			System.out.println("����ֵӦ����0-100֮��,Ĭ��ֵΪ40");
			
		} else {
            this.health=health;
		}
			
	}
	
	
	public int getLove() {
		
		return love;
		
		
		
	}
	
public void setLove() {
		
		this.love=love;
		
		
		
	}
	
public String getStrain() {
	
   return strain;
	
	
	
}

public void setStrain(String strain) {
	
	this.strain=strain;
	
	
	
}
	
public void print() {
	 System.out.println("�����������"+this.name+"\t����Ľ���ֵ��"+this.health+"\t�����˵����ܶ���"+this.love+"\t������Ʒ����"+this.strain);
	 
	 
	 
}


public void play() {
   if (health<60) {
	System.out.println("����������");
} else {
   System.out.println("�������ں�������ˣ");
   health =health-10;
   love=love+5;
   
}
	
}
 
public static void main(String[] args) {
	
	Dog1 dog=new Dog1();
	dog.print();
	
	
	
}


	}
	

