package com.Zoo2;

public class Dack extends Animal {
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
	public Dack(String name, int legNum, String name2, int legNum2) {
		super(name, legNum);
		name = name2;
		legNum = legNum2;
	}
	public Dack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dack(String name, int legNum) {
		super(name, legNum);
		// TODO Auto-generated constructor stub
	}
        
}
