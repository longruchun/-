package com.Zoo1;

public class Cat extends Animal {
   private String name;//猫的名字
   private int legNum;//猫的腿的条数
public Cat(String name, int legNum, String name2, int legNum2) {
	super(name, legNum);
	name = name2;
	legNum = legNum2;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLegNum() {
	return legNum;
}
public void setLegNum(int legNum) {
	this.legNum = legNum;
}
   
public void shout() {
	
	System.out.println("猫咪在叫");
}

}
