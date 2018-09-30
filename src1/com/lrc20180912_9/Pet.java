package com.lrc20180912_9;
public abstract class Pet {
	protected String name = "ÎŞÃûÊÏ";// êÇ³Æ
	protected int health = 100;// ½¡¿µÖµ
	protected int love = 0;// Ç×ÃÜ¶È
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
