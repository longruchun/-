package com.lrc20180906;

import java.util.Scanner;

public class Students {
     private   String name="����";
     private   int age=0;
     Scanner input=new Scanner(System.in);
    public void SetAge() {
    	if ( age<16) {
			System.out.println("�������");
		} else {
            System.out.println("������ȷ");
		}
    	
    	
    }  
	
	public void showme() {
		
		
		
		System.out.println("��Һ��ҽ�:"+name+"�ҽ���"+age+"����");
		
		
		
	}
	
	
	public void Test() {
		System.out.println("�������������");
		this.name=input.next();
		System.out.println("�������������");
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
