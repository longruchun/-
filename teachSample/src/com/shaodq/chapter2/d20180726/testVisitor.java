package com.shaodq.chapter2.d20180726;

import java.util.Scanner;

public class testVisitor {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int count=0;
		while (true) {
			count++;
			System.out.println("第"+count+"位游客购票:");
			Visitor vist = new Visitor();
			
			System.out.println("请问您的姓名：");
			vist.name=input.next();
			System.out.println("您的年龄:");
			vist.age=input.nextInt();
			
			vist.buyTicket();
			
			System.out.println("还有游客要买票吗?(y Or n)");
			
			if(input.next().equals("n")){
				break;//已无排队购票的游客，退出购票循 环
			}
			
			
		}
		
		System.out.println("程 序结束,谢谢使用.");
        
	}

}
