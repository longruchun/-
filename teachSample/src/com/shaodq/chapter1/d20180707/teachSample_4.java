package com.shaodq.chapter1.d20180707;


import java.util.Scanner;

public class teachSample_4 {

	public static void main(String[] args) {
		   Scanner input =new Scanner(System.in);
		   int Max;//定义一个变量保存最大值
		   //原始数据采集 	
		   System.out.println("请任意输入三个数：");
		   System.out.print("a:");
		   int a=input.nextInt();
		   Max=a;
		   
		   
		   System.out.print("b:");
		   int b=input.nextInt();
		   if(b>Max){
			   Max=b;
		   }
		   
		   
		   
		   System.out.print("c:");
		   int c=input.nextInt();
		   if(c>Max){
			   Max=c;
		   }
		   
		   
		   System.out.println("三个数中的最大值是："+Max);
		   //数据排序
	}
	
	
	

}
