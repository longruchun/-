package com.shaodq.chapter2.d20180723;

import java.util.Arrays;
import java.util.Scanner;


public class teachSample5 {

	public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        
        System.out.println("请输入今天星期几?(1-7)");
        int week = input.nextInt();
        
        /*if(week==1){
        	System.out.println("今天星期一");
        }else if(week==2){
        	System.out.println("今天星期二");
        }else if(week==3){
        	System.out.println("今天星期三");
        }else if(week==4){
        	System.out.println("今天星期四");
        }else if(week==5){
        	System.out.println("今天星期五");
        }else if(week==6){
        	System.out.println("今天星期六");
        }else if(week==7){
        	System.out.println("今天星期天");
        }else{
        	System.out.println("输入出错");
        }*/
        
        switch(week){
	        case 1:
	        	System.out.println("今天星期一");
	        	//break;
	        case 2:
	        	System.out.println("今天星期二");
	        	//break;
	        case 3:
	        	System.out.println("今天星期三");
	        	//break;
	        case 4:
	        	System.out.println("今天星期四");
	        	//break;
	        case 5:
	        	System.out.println("今天星期五");
	        	break;
	        case 6:
	        	System.out.println("今天星期六");
	        	break;
	        case 7:
	        	System.out.println("今天星期日");
	        	break;
	        default:
	        	System.out.println("输入出错");
	        	break;
        
        }
		
	}

}
