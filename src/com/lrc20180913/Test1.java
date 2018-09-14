package com.lrc20180913;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入被除数");
		int num1=input.nextInt();
		System.out.println("请输入除数");
		int num2=input.nextInt();
		
		System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
		System.out.println("感谢你使用本程序");
	}
	
	
}
