package com.Zoo2;

public   abstract class    Animal {
   private String name;
   private    int    legNum;//�ȵ�����
   
   
public abstract void Shout();   
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
