package com.lrc20180910;

public class Student {
  private String sex;
  private int age;
  
public String getSex() {
	return sex;
}

public void setSex(String sex) {
	
	if (sex.equals("男")||sex.equals("女")) {
		this.sex = sex;
	} else {
        System.out.println("输入出错性别只有（男和女）否则默认为(男)");
        this.sex = "男";
	}
	
	
}

public int getAge() {
	
	
	
	return age;
}

public void setAge(int age) {
	
	if ( age<=100) {
		this.age = age;
	}else {
		
		System.out.println("输入出错没有长生不老的人");
	}
	
}
 

public void print() {
	
	System.out.println("学生的性别是:"+this.sex+"\n学生的年龄是:"+this.age);
}
	

	
	
}
