package com.lrc20180915_2;

public class Dog {
	private String name; // �ǳ�
	private int health = 100; // ����ֵ
	private int love = 10; // ���ܶ�
	private String strain; // Ʒ��

	public Dog(String name,String strain) {
		this.name = name;
		this.strain = strain;			
	}

	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public String getStrain() {
		return strain;
	}
}
