package com.lrc20180910;

public abstract class Pet1 {
   private String name="无名氏";
   private int health=100;
   private int love=0;
   
   public Pet1(String name) {
	   
	   this.name=name;
	   
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}

public int getLove() {
	return love;
}

public void setLove(int love) {
	this.love = love;
}
	
	
	public void print() {
		
		System.out.println("宠物的名字是"+this.name+"\n宠物的健康值是"+this.health+"与主人的亲密度是"+this.love);
	}
	
}
