package com.lrc20180911inherit2;

public class Dog extends Pet {
  private String strain="牧羊犬";
  
  public void print() {
	  
	  
	  super.print();
	  System.out.println("狗狗的品种是"+this.strain);
	  
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
