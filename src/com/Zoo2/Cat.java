package com.Zoo2;

public class Cat extends Animal {
	private String name;
	   private int legNum;
	@Override
	public void Shout() {
		// TODO Auto-generated method stub

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
	public Cat(String name, int legNum, String name2, int legNum2) {
		super(name, legNum);
		name = name2;
		legNum = legNum2;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int legNum) {
		super(name, legNum);
		// TODO Auto-generated constructor stub
	}
   
}
