package com.lrc20180917_1;

public class Penguin {
	String name = "������"; // �ǳ�
	int health = 100; // ����ֵ
	int love = 0; // ���ܶ�
	String sex = "Q��"; // �Ա�
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
