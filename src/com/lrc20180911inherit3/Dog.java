package com.lrc20180911inherit3;

public class Dog extends Pet {
  private String strain="����Ȯ";
  
  public void print() {
	  
	  
	  System.out.println("�����������"+this.name+"\t����Ľ���ֵ��"+this.health+"\t�����˵����ܶ���"+this.love+"������Ʒ����"+this.strain);
	 
	  
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
