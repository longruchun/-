package com.lrc20180907;

public class Student2 {

	
	private String name; //����
	private int age; //����
	private String sex; //�Ա�
	private String subject; //רҵ
	
	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
		this.sex = "��";
		this.subject = "����";
	}
	
	public Student2(String name, int age, String sex, String subject) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.subject = subject;
	}
	
	public String introduction() {
		return "��Һã�����" + name + "���ҽ���" + age + "��,�Ա���" + sex + ",רҵ��"
				+ subject;
	}







	
	
	
	
	
	
	
	
}
