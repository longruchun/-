package com.lrc20180914;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
	
	  Scanner input=new Scanner(System.in);
	  
	  try {
		  System.out.println("������һ��������");
		  int num1=input.nextInt();
		  
		  System.out.println("������һ������");
		  int num2=input.nextInt();
		  
		  System.out.println(num1+"/"+num2+"="+(num1/num2));
		  
		  
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.err.println("�������"+e.getMessage());
		
		
	}finally {
		
		
		System.out.println("��л��ʹ�ñ�����");
		
	}
	System.out.println("�������");  
}
}
