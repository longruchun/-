package com.lrc20180911inherit4;

public  abstract class Dog extends Pet {
  private String strain="����Ȯ";
  
  public abstract  void print();

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
