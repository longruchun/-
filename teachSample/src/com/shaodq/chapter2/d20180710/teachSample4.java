package com.shaodq.chapter2.d20180710;

import java.util.Scanner;

public class teachSample4 {

	public static void main(String[] args) {
	   //从键盘接收一个字符型 的小写字母，将之大写形式出
		Scanner input=new Scanner(System.in);
		/*System.out.println("请输入一个小写字母：");
		char ch=input.next().charAt(0);
		System.out.println("您输入的小写字母："+ch+" 对应的大写字母是:"+(char)(ch-32));*/
		
		//System.out.println('a'-'A');
		//设计一个变量来记录每个月有多少天
		int days=0;
		
		System.out.println("请输入月份：");
		int month=input.nextInt();
		System.out.println("请输入日期：");
		int day=input.nextInt();
		
		/*switch(month){
		   case 1:
			   days+=day;
			   break;
		   case 2:
			   days+=31;
			   days+=day;
			   break;
		   case 3:
			   days+=31+28;
			   days+=day;
			   break;
		   case 4:
			   days+=31+28+31;
			   days+=day;
			   break;
		   case 5:
			   days+=31+28+31+30;
			   days+=day;
			   break;  	   
		
		}*/
		
		switch(month){
			case 12:
				if(month==12){
					days+=day;
				}else{
					days+=31;
				}
			case 11:
				if(month==11){
					days+=day;
				}else{
					days+=30;
				}
		    case 10:
				if(month==10){
					days+=day;
				}else{
					days+=31;
				}
			case 9:
				if(month==9){
					days+=day;
				}else{
					days+=30;
				}
			case 8:
				if(month==8){
					days+=day;
				}else{
					days+=31;
				}
			case 7:
				if(month==7){
					days+=day;
				}else{
					days+=31;
				}
			case 6:
				if(month==6){
					days+=day;
				}else{
					days+=30;
				}
		    case 5:
				if(month==5){
					days+=day;
				}else{
					days+=31;
				}
			case 4:
				if(month==4){
					days+=day;
				}else{
					days+=30;
				}
			case 3:
				if(month==3){
					days+=day;
				}else{
					days+=31;
				}
			case 2:
				if(month==2){
					days+=day;
				}else{
					days+=28;
				}
			case 1:
				if(month==1){
					days+=day;
				}else{
					days+=31;
				}	
			}
		System.out.println("你输入的日期:"+month+"月"+day+"日,是该年的第"+days+"天");
	}

}
