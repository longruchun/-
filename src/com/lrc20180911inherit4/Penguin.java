package com.lrc20180911inherit4;

public abstract  class Penguin extends Pet {
   private String sex="Q��";
   
   public abstract void print();

public Penguin() {//�޲ҹ��췽��
	super();
	// TODO Auto-generated constructor stub
}


public Penguin(String sex) {
	super();
	this.sex = sex;
}

public String getSex() {
	return sex;
}
	
   
	
}
