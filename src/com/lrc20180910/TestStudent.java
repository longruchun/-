package com.lrc20180910;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	
		Student stu=new Student();
		
		System.out.println("请输入学生的年龄");
		int age=input.nextInt();
		stu.setAge(age);
		
		System.out.println("请输入学生的性别");
		String sex=input.next();
		stu.setSex(sex);
		
		stu.print();
		
	}
}
