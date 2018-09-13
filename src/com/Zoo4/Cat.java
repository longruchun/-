package com.Zoo4;

public class Cat extends Animal implements Terrestrial {
	private String name;
	private int legNum;
	@Override
	public int getLegnum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Shout() {
		// TODO Auto-generated method stub
          System.out.println("ίχίχ");
	}

	public Cat(String name, int legNum) {
		super();
		this.name = name;
		this.legNum = legNum;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
