package com.lrc20180911;

public class Dog {
  private String name;
  private int health;
  private int love;
  private String strain;
public Dog(String name, int health, int love, String strain) {
	super();
	this.name = name;
	this.health = health;
	this.love = love;
	this.strain = strain;
}

public Dog() {
	super();
	// TODO Auto-generated constructor stub
}
  

  
public void print() {
	
	
	System.out.println("������������:"+this.name+"\t�����Ľ���ֵ��:"+this.health+"\t�����˵����ܶ���"+this.love+"\t������Ʒ����"+this.strain );
	
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
	
	if (health<=100&&health>0) {
		this.health = health;
		
	} else {
       System.out.println("�������(����ֵ)");
	}
	
	
	
}

public int getLove() {
	return love;
}

public void setLove(int love) {
	this.love = love;
}

public String getStrain() {
	return strain;
}

public void setStrain(String strain) {
	this.strain = strain;
}
  
	
	

	
	
}
