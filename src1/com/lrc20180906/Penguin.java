package com.lrc20180906;

public class Penguin {

	String name="无名氏";
	int health=100;
	int love=0;
	
	static final String SEX_MALE="Q仔";
	static final String SEX_FEMALE="Q妹";
	
	String sex=SEX_MALE;//性别
	
	
	public void print(){
		
		System.out.println("宠物的名字是"+this.name+"\n健康值是"+this.health+"\n和主人的亲密度是"+this.love+"\n性别是"+this.sex+"。");
		
	}
	
	public static void main(String[] args) {
		 Penguin pg=new  Penguin();
		 pg.print();
		
	}
	
	
}
