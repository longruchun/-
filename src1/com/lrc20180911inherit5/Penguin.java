package com.lrc20180911inherit5;

public class Penguin extends Pet {
   private String sex="Q��";
   
   public void print() {
	   
	   super.print();
	   
	   System.out.println("�����Ա���"+this.sex);
   }

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
