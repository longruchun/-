package com.lrc20180911inherit4;

public abstract  class Penguin extends Pet {
   private String sex="Q仔";
   
   public abstract void print();

public Penguin() {//无惨构造方法
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
