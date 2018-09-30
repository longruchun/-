package com.shaodq.chapter2.d20180710;

import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input=new Scanner(System.in);
		
		System.out.println("请输入今天是星期几?(1-5)");
		int week=input.nextInt();
		
		switch(week){
		case 1:
     	   
        case 2:
        	
        case 3:
        	System.out.println("学习java ");
     	   break;
        case 4:
        	
        case 5:
        	System.out.println("学习前端 ");
     	   break;
        default:
     	   System.out.println("选择出错");
     	   
		}*/
		
		String season = "summer";
		switch (season) {
		case "spring":
		System.out.println("春暖花开");
		break;
		case "summer1":
		System.out.println("夏日炎炎");
		break;
		case "summer":
		System.out.println("秋高气爽");
		break;
		case "winter":
		System.out.println("冬雪皑皑");
		break;
		default:
		System.out.println("季节输入有误");
		break;
		}
	}

}
