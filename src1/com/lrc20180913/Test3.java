package com.lrc20180913;

import java.util.Scanner;

public class Test3 {
   public static void main(String[] args) {
	
	   try {
		   
		  Scanner input=new Scanner(System.in);
			System.out.println("�����뱻����");
			int num1=input.nextInt();
			System.out.println("���������");
			int num2=input.nextInt();
			
			System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
			System.out.println("��л��ʹ�ñ�����");
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println("���ִ��󱻳����ͳ�������������"+"��������Ϊ0");
		e.printStackTrace();
		
	}
	   
	   
	   
	   
}
	
	
	
}
