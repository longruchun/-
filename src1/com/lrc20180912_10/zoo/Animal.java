package com.lrc20180912_10.zoo;

public abstract class Animal {
	private String name = null;// ����
	private int legNum = 0; //�ȵ�����
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
