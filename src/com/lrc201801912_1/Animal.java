package com.lrc201801912_1;

abstract class Animal {
	private int age = 0;//ÄêÁä
	
	public Animal() {
		
	}
	
	public Animal(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
