package com.lrc20180906;

import java.util.Scanner;

public class Students {
     private   String name="张三";
     private   int age=0;
     Scanner input=new Scanner(System.in);
    public void SetAge() {
    	if ( age<16) {
			System.out.println("输入出错");
		} else {
            System.out.println("输入正确");
		}
    	
    	
    }  
	
	public void showme() {
		
		
		
		System.out.println("大家好我叫:"+name+"我今年"+age+"岁了");
		
		
		
	}
	
	
	public void Test() {
		System.out.println("请输入你的姓名");
		this.name=input.next();
		System.out.println("请输入你的年龄");
		this.age=input.nextInt();
		SetAge();
		System.out.println();
		showme();
		
	}
	
	public static void main(String[] args) {
		Students  stu=new Students();
		 stu.Test();
		
		
		
	}
	
	
	
}
