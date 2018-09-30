package com.lrc20180913;

import java.util.Scanner;

public class Test2 {
 public static void main(String[] args) {
	
	 Scanner input=new Scanner(System.in);
	 System.out.println("请输入被除数");
	 int num1=0;
	 if (input.hasNextInt()) {//如果输入的被除数是整数
		 num1=input.nextInt();
		 
		
	} else {//如果输入的除数不是整数
		System.err.println("输入的不是整数程序退出");
      	System.exit(1);//结束程序运行
 
	}
	 
	 System.out.println("请输入除数");
	 
	 int num2=0;
	 
	 if (input.hasNextInt()) {//如果除数是整数
		 num2=input.nextInt();
		 
		 if (0==num2) {//如果输入的除数不是0
			 
			 System.out.println("输入的除数是0,程序退出");
			 System.exit(1);
			
		}
		
	} else {//如果输入的不是整数
		
		System.out.println("你输入的不是整数,程序退出");
		 System.exit(1);

	}
	 
		System.out.println(String.format("%d/%d=%d", num1));
		System.out.println("感谢你使用本程序");
}
	
}
