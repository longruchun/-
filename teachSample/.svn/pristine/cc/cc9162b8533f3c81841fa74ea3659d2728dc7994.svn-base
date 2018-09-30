package com.shaodq.chapter1.d20180707;


import java.util.Scanner;

public class teachSample_3 {

	public static void main(String[] args) {
	   Scanner input =new Scanner(System.in);
	   //原始数据采集 	
	   System.out.println("请任意输入三个数：");
	   System.out.print("a:");
	   int a=input.nextInt();
	   System.out.print("b:");
	   int b=input.nextInt();
	   System.out.print("c:");
	   int c=input.nextInt();
	   System.out.println("排序前:a="+a+"\tb="+b+"\tc="+c);
	   //数据排序
	   //第一次比较：a:b
	   if(a>b){
		   int temp=a;
		   a=b;
		   b=temp;
	   }else if(a>c){//第二次比较：a:c
		   int temp=a;
		   a=c;
		   c=temp;
	   }else if(b>c){//第三次比较b:c
		   int temp=b;
		   b=c;
		   c=temp;
	   }
	   
	   
	   
	   
	   System.out.println("排序后:a="+a+"\tb="+b+"\tc="+c);
	}
	
	
	

}
