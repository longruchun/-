package com.lrc201801912_1;

class Student1 {
	private String name;// 姓名
	private int age; // 年龄
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 16) {
			System.out.println("错误！您还不符合最小年龄要求！");
		}
		this.age = age;
	}

	public String introduction() {
		return "大家好！我是" + name + "，我今年" + age + "岁";
	}
}
