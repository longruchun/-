package com.lrc20180907;

public class Student2 {

	
	private String name; //姓名
	private int age; //年龄
	private String sex; //性别
	private String subject; //专业
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
		this.sex = "男";
		this.subject = "机电";
	}
	
	public Student2(String name, int age, String sex, String subject) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.subject = subject;
	}
	
	public String introduction() {
		return "大家好！我是" + name + "，我今年" + age + "岁,性别是" + sex + ",专业是"
				+ subject;
	}







	
	
	
	
	
	
	
	
}
