package com.lrc20180911inherit;

public class Dog extends Pet {
  private String strain="旺旺";

  public void print() {
	  super.print();
	  this.strain="小狗";
	  System.out.println("狗狗的品种是:"+this.strain);
	  
  }
  
  public void eat() {
	  
	  System.out.println("狗狗正在吃");
  }
public Dog(String name, int health, int love, String strain) {
	super(name, health, love);
	this.strain = strain;
}

public Dog() {
	super();
	// TODO Auto-generated constructor stub
}

public Dog(String name, int health, int love) {
	super(name, health, love);
	// TODO Auto-generated constructor stub
}

public String getStrain() {
	return strain;
}

public void setStrain(String strain) {
	this.strain = strain;
}



	
	
}
