package com.lrc20180912_9;
public abstract class Pet {
	protected String name = "������";// �ǳ�
	protected int health = 100;// ����ֵ
	protected int love = 0;// ���ܶ�
	public Pet(String name) {
		this.name = name;
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
	public abstract void print();
}
