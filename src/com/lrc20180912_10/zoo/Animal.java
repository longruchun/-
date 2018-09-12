package com.lrc20180912_10.zoo;

public abstract class Animal {
	private String name = null;// 名字
	private int legNum = 0; //腿的条数
	public Animal(String name, int legNum) {
		this.name = name;
		this.legNum = legNum;
	}
	public String getName() {
		return name;
	}
	public int getLegNum() {
		return legNum;
	}	
	public abstract void shout();

}
