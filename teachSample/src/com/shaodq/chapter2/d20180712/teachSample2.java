package com.shaodq.chapter2.d20180712;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//无论如何先执行一次，总共权执行多少次，不能预知
		//适用do---while循 环,注意它的语法格式
		Scanner input=new Scanner(System.in);
		boolean isOk;
		
		do{
			System.out.println("令狐师兄练剑.");
			System.out.println("合格了吗?");
			isOk=input.nextBoolean();
		}while(!isOk);
		
		System.out.println("我们去山里逛逛.");
	}

}
