package com.lrc20180907;

public class Pet {
    private String name="无名";
    private int health=100;
    private int love=0;
	
	
	public  Pet() {
		this.health=95;
		System.out.println("执行宠物的无惨方法");
		
		
		
		
	}
	
	public Pet(String name) {
		
		
		this.name=name;
		
	}
	
	public  String   getName() {
		
		
		
		return name;
	}
	
	
  public  int  gethealth() {
		
		
		
		return health;
	}
	
	
  public  int  getlove() {
	
	
	
	return love;
  }

  public void print() {
	
	
	System.out.println("我的名字叫"+this.name+"\n健康值是"+this.health+"\n我和主人的亲密度是"+this.love    );
	
	
 }
	
}
