package com.lrc20180910;

public abstract class Pet1 {
   private String name="������";
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
		
		System.out.println("�����������"+this.name+"\n����Ľ���ֵ��"+this.health+"�����˵����ܶ���"+this.love);
	}
	
}
