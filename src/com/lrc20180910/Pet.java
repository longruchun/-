package com.lrc20180910;

public class Pet {
  private String name;
  private int health;
  private int love;
  
  public void print() {
	  
	  System.out.println("宠物的名字是"+this.name+"\n宠物的健康值是"+this.health+"\n主人的亲密度是"+this.love);
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
  
  
  
  
}
