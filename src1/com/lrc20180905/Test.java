package com.lrc20180905;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请输入要领养宠物的名字：");
		String name = input.next();
		System.out.print("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		switch (input.nextInt()) {
		case 1:
			System.out.print("请选择狗狗的品种:(1、聪明的拉布拉多犬" +
					" 2、酷酷的雪娜瑞)");
			String strain =null;
			if (input.nextInt() == 1) {
				strain = "聪明的拉布拉多犬";
			} else {
				strain = "酷酷的雪娜瑞";
			}
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			dog.print();
			break;
		case 2:
			
			System.out.print("请选择企鹅的性别：（1、Q仔 2、Q妹）");
			String sex = null;
			if (input.nextInt() == 1)
				sex = "Q仔";
			else
				sex = "Q妹";
			
			Penguin pgn = new Penguin();
			pgn.name = name;
			pgn.sex = sex;
		
		}
	}
}
