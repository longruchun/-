package com.lrc20180911inherit;

public class Dog extends Pet {
  private String strain="����";

  public void print() {
	  super.print();
	  this.strain="С��";
	  System.out.println("������Ʒ����:"+this.strain);
	  
  }
  
  public void eat() {
	  
	  System.out.println("�������ڳ�");
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
