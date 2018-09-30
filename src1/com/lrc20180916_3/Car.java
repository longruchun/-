package com.lrc20180916_3;

public class Car {
   int id;
   String Name;
   String Type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public Car(int id, String name, String type) {
	super();
	this.id = id;
	Name = name;
	Type = type;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}





}
