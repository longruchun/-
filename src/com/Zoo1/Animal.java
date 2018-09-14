package com.Zoo1;

public class Animal {
   private String name;//动物的名字
   private    int    legNum;//腿的数量
public Animal(String name, int legNum) {
	super();
	this.name = name;
	this.legNum = legNum;
}
public Animal() {
	super();
	// TODO Auto-generated constructor stub
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
   



}
