package com.lrc20180914;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
	
	  Scanner input=new Scanner(System.in);
	  
	  try {
		  System.out.println("请输入一个被除数");
		  int num1=input.nextInt();
		  
		  System.out.println("请输入一个除数");
		  int num2=input.nextInt();
		  
		  System.out.println(num1+"/"+num2+"="+(num1/num2));
		  
		  
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.err.println("输入出错"+e.getMessage());
		
		
	}finally {
		
		
		System.out.println("感谢你使用本程序");
		
	}
	System.out.println("程序结束");  
}
}
