package com.lrc20180912_11;


public class Duck extends Animal implements Terrestrial {
	private int legNum = 0; // �ȵ�����
	public Duck(String name,int legNum) {
		super(name);
		this.legNum = legNum;
	}
	public void shout() {
		System.out.println("�¸¸�");
	}
	public int getLegNum() {
		return legNum;
	}
}
