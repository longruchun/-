package com.lrc20180917_1;

public class Penguin {
	String name = "无名氏"; // 昵称
	int health = 100; // 健康值
	int love = 0; // 亲密度
	String sex = "Q仔"; // 性别
	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
