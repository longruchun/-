package com.lrc20180911Polymorphism2;

public class Master {
    private String name="";//���˵�����
    private int money=0;//Ԫ����
	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
    
	public void feed(Dog dog){
		
		dog.eat();
	}
    
    public void feed(Penguin pen){
		
		pen.eat();
	}
    
	
	
}
