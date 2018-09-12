package com.lrc20180905;

public class Dog1 {


	 private   String name="没得名字";
	 private   int health=100;
	 private   int love=0;
	 private   String strain="狼狗";

	
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
			System.out.println("健康值应该在0-100之间,默认值为40");
			
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
	 System.out.println("宠物的名字是"+this.name+"\t宠物的健康值是"+this.health+"\t和主人的亲密度是"+this.love+"\t狗狗的品种是"+this.strain);
	 
	 
	 
}


public void play() {
   if (health<60) {
	System.out.println("狗狗生病了");
} else {
   System.out.println("狗狗正在和主人玩耍");
   health =health-10;
   love=love+5;
   
}
	
}
 
public static void main(String[] args) {
	
	Dog1 dog=new Dog1();
	dog.print();
	
	
	
}


	}
	

