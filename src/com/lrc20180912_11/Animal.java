package com.lrc20180912_11;

public abstract class Animal {
	private String name = null;// ����

	public Animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void shout();
}
