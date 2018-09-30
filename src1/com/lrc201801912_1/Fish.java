package com.lrc201801912_1;
public class Fish extends Animal {
	private int weight = 4;//重量
	public Fish(int age, int weight) {
		super(age);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void info() {
		System.out.println("我是一只" + weight + "斤重的鱼！");
		System.out.println("今年" + this.getAge() + "岁了！");
		System.out.println();
	}
}
