package com.lrc20180910practice;


public class Dog extends Pet {
	private String strain;// Ʒ��

	
	public Dog(String name, String strain) {
		super(name); // �˴�����ʹ��this.name=name;
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}	
}
