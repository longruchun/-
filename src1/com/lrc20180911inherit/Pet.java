package com.lrc20180911inherit;

public class Pet {
    String name="����";
    int health=100;
    int love;
    public void print() {
    	
    	System.out.println("�����������:"+this.name+"\t����Ľ���ֵ��"+this.health+"\t���������˵����ܶ���"+this.love);
    	
    	
    }
    
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
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
