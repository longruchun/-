package com.lrc20180910;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	
		Student stu=new Student();
		
		System.out.println("������ѧ��������");
		int age=input.nextInt();
		stu.setAge(age);
		
		System.out.println("������ѧ�����Ա�");
		String sex=input.next();
		stu.setSex(sex);
		
		stu.print();
		
	}
}
