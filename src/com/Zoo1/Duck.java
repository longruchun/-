package com.Zoo1;

public class Duck extends Animal {
   private   String name;
	private  int legNum;
	
	
	public void shout() {
		
		
		System.out.println("Ñ¼×ÓÔÚ½Ð");
	}
	public Duck(String name, int legNum, String name2, int legNum2) {
		super(name, legNum);
		name = name2;
		legNum = legNum2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegNum() {
		return legNum;
	}
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	
	
	
	
}
