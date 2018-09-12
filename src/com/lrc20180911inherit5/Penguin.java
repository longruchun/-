package com.lrc20180911inherit5;

public class Penguin extends Pet {
   private String sex="Q仔";
   
   public void print() {
	   
	   super.print();
	   
	   System.out.println("企鹅的性别是"+this.sex);
   }

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
