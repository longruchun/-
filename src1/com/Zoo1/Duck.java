package com.Zoo1;

public class Duck extends Animal {
   private   String name;//鸭子的名字
	private  int legNum;//鸭子的腿的数量
	
	
	public void shout() {
		
		
		System.out.println("鸭子在叫");
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
