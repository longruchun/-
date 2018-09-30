package com.shaodq.chapter2.d20180718;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1   input.nextLine()
		//2   数组与数组之间的赋值
		
		Scanner input=new Scanner(System.in);
		
		/*System.out.println("请由键盘输入一个由空格分隔的字符串，并打印输出:");
		String _receive=input.nextLine();
		System.out.println("您输入的是:"+_receive);*/
		
		//提示从键盘任意输入数值并打印输出，输入0示意和序结束
		int i=1;
		do{
			System.out.println("请输入一个数值(输入0示意结束):");
			if(input.hasNextInt()){
			   i=input.nextInt();
			   System.out.println(i);
			}else{
			   System.out.println("输入不匹配");
			   input=new Scanner(System.in);

			}
			

			
		}while(i!=0);
		
		System.out.println("结束");
		
	}

}
