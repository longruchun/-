package com.Zoo5;


public class Duck extends Animal implements Terrestrial {
	private int legNum = 0; // 揚議訳方
	public Duck(String name,int legNum) {
		super(name);
		this.legNum = legNum;
	}
	public void shout() {
		System.out.println("限限限");
	}
	public int getLegNum() {
		return legNum;
	}
}
