package com.lrc20180911inherit2;

public class Dog extends Pet {
  private String strain="����Ȯ";
  
  public void print() {
	  
	  
	  super.print();
	  System.out.println("������Ʒ����"+this.strain);
	  
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
