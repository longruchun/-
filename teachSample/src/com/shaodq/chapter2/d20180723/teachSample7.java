package com.shaodq.chapter2.d20180723;

import java.util.Arrays;
import java.util.Scanner;


public class teachSample7 {

	public static void main(String[] args) {
        //现实场景:老师让小明抄写50遍"杨辉三角"的java实现代码
		//由于每一遍抄写，都 是周而复始的重复动作，小明能否从中想出一个简便办法呢？
		//在java的世界， 我们用循 环可以简化这个过程 
		/*int i=0;
		for(;;){
			System.out.println("杨辉三角代码");
			i++;
			
			if(i>=50){
				break;
			}
		}
		
		System.out.println("循环结束后的第一个语句.");*/
		
		Scanner input=new Scanner(System.in);
		String answer="";
		do{
			System.out.println("岳灵珊与令狐冲练剑.");
			System.out.println("令狐冲问：合格了吗?(y Or n)");
			answer=input.next();
		}while("n".equals(answer));//answer.equals("n");
	}

}
