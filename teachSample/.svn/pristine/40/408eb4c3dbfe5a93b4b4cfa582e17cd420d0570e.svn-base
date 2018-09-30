package com.shaodq.chapter2.d20180716;

import java.util.Scanner;

public class teachSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //continue 关键 字在循 环中的使用
		//生活场景:某人运动场上奔跑了，每跑一圈，助手询问是否需要饮水，若需要，就饮水后再跑，若不需要，就继续跑
		Scanner input =new Scanner(System.in);
		
		String answer;
		
		String  tired;
		
		for(int i=0;i<15;i++){
			System.out.println("选手跑第"+(i+1)+"圈");
			
			System.out.println("助手问，要饮水不?(y Or n)");
			answer=input.next();
			
			System.out.println("助手问，累得无法坚持吗?(y Or n)");
			tired=input.next();
			
			if(answer.equals("n")){
				//如果选手回答"不渴"---就是不喝水,需要跳过条件语句结束后第一个"喝水"语句的执行
				continue;
			}
			
			if(tired.equals("y")){
				break;
			}
			
			System.out.println("选手喝水");
			
		}
		
		
		
	}

}
