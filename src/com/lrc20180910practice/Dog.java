package com.lrc20180910practice;


public class Dog extends Pet {
	private String strain;// 品种

	
	public Dog(String name, String strain) {
		super(name); // 此处不能使用this.name=name;
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}	
}
