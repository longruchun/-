package com.lrc20180917_2;

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

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
