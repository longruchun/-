package com.lrc20180913;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����뱻����");
		int num1=input.nextInt();
		System.out.println("���������");
		int num2=input.nextInt();
		
		System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
		System.out.println("��л��ʹ�ñ�����");
	}
	
	
}
