package com.lrc201801912_1;

class Student1 {
	private String name;// ����
	private int age; // ����
	
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
			System.out.println("����������������С����Ҫ��");
		}
		this.age = age;
	}

	public String introduction() {
		return "��Һã�����" + name + "���ҽ���" + age + "��";
	}
}
