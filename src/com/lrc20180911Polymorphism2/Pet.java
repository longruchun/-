package com.lrc20180911Polymorphism2;

public  abstract  class Pet {
    protected String name="������";
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
    	
    	System.out.println("�����������"+this.name+"\t����Ľ���ֵ��"+this.health+"\t�����˵����ܶ���"+this.love);
    }
    
    public abstract void eat();
}
