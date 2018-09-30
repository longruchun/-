package com.lrc20180906;

public class Dog {

	private String name="无名氏";
	private int health=100;
	private int love=0;
	private String strain="聪明的小狗";
	
	public Dog(String name,String strain){
		this.name=name;
		this.strain=strain;
		
		
	}
	
	public void eat(){
		if (health>=100) {
			System.out.println("小狗狗应该多运动");
		} else {
                  health=health+3;
                  System.out.println("狗狗该吃饭了");
		}
		
		
		
	}
			
	public String getName(){
		
		return name;
		
		
	}
	
	public int getHealth(){
		return health;
		
		
		
		
	}
	
	
	public int getlove(){
		
		
		return love;
		
		
		
		
	}
	
	public String getStrain(){
		return strain;
		
		
		
		
	}
	
	public void print(){
		
		System.out.println("我的名字是"+this.name +"\t健康值是"+this.health+"和主人的请密度是\t"+this.love+"我是一只"+this.strain);
		
	}
	
	public static void main(String[] args) {
		Dog dog=new Dog("xiaogou", "1");
		 dog.print();
	}
	
}
