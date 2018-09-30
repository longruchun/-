package com.lrc20180915_2;

public class Dog {
	private String name; // 昵称
	private int health = 100; // 健康值
	private int love = 10; // 亲密度
	private String strain; // 品种

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
