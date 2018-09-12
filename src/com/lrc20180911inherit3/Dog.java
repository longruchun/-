package com.lrc20180911inherit3;

public class Dog extends Pet {
  private String strain="牧羊犬";
  
  public void print() {
	  
	  
	  System.out.println("宠物的名字是"+this.name+"\t宠物的健康值是"+this.health+"\t与主人的亲密度是"+this.love+"狗狗的品种是"+this.strain);
	 
	  
  }

public Dog() {
	super();
	// TODO Auto-generated constructor stub
}

public Dog(String strain) {
	super();
	this.strain = strain;
}

public String getStrain() {
	return strain;
}
	
	
	
}
