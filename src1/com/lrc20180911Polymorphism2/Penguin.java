package com.lrc20180911Polymorphism2;

public class Penguin extends Pet {

	  private String sex;
	public Penguin(String name,String sex) {
		super(name);
		this.sex=sex;
		// TODO Auto-generated constructor stub
	}

	
	 public void print(){
		 
		 super.print();
		 System.out.println("�Ա���"+this.sex+"");
		 
	 }
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
       super.health=super.health+5;
       System.out.println("���"+super.name+"�Ա���!����ֵ����5");
	}

}
