package com.lrc20180911inherit;

public class Penguin extends Pet {
  private String sex;

  
  
public void print() {
	super.print();
	this.sex="Q��";
	System.out.println("�����Ա���:"+this.sex);
	
}  
public void swimming() {
	
	System.out.println("���������Ӿ");
}
public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public Penguin(String name, int health, int love, String sex) {
	super(name, health, love);
	this.sex = sex;
}

public Penguin() {
	super();
	// TODO Auto-generated constructor stub
}

public Penguin(String name, int health, int love) {
	super(name, health, love);
	// TODO Auto-generated constructor stub
}
  
  
	
	
}
