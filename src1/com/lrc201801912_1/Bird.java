package com.lrc201801912_1;
public class Bird extends Animal {
	private String color = "��ɫ";//��ɫ
	public Bird(int age, String color) {
		super(age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void info() {
		System.out.println("����һֻ" + color + "����");
		System.out.println("����" + this.getAge() + "���ˣ�");
		System.out.println();
	}
}
