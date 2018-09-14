package com.lrc20180913;

import java.util.Scanner;

public class TestException1 {
	public static void main(String[] args) {
		System.out.print("请输入课程代号(1～3之间的数字):");
		Scanner input = new Scanner(System.in);
		try {
			int courseCode = input.nextInt();
			switch (courseCode) {
			case 1:
				System.out.println("C#编程");
				break;
			case 2:
				System.out.println("Java编程");
				break;
			case 3:
				System.out.println("SQL基础");
			}
		} catch (Exception ex) {
			System.out.println("输入不为数字!");
			ex.printStackTrace();
		} finally {
			System.out.println("欢迎提出建议!");
		}
	}
}
