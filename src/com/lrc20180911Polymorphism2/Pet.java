package com.lrc20180911Polymorphism2;

public  abstract  class Pet {
    protected String name="无名氏";
    protected int health=100;
    protected int love =0;
	public Pet(String name) {
		super();
		this.name = name;
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
    	
    	System.out.println("宠物的名字是"+this.name+"\t宠物的健康值是"+this.health+"\t和主人的亲密度是"+this.love);
    }
    
    public abstract void eat();
}
