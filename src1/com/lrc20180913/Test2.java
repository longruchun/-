package com.lrc20180913;

import java.util.Scanner;

public class Test2 {
 public static void main(String[] args) {
	
	 Scanner input=new Scanner(System.in);
	 System.out.println("�����뱻����");
	 int num1=0;
	 if (input.hasNextInt()) {//�������ı�����������
		 num1=input.nextInt();
		 
		
	} else {//�������ĳ�����������
		System.err.println("����Ĳ������������˳�");
      	System.exit(1);//������������
 
	}
	 
	 System.out.println("���������");
	 
	 int num2=0;
	 
	 if (input.hasNextInt()) {//�������������
		 num2=input.nextInt();
		 
		 if (0==num2) {//�������ĳ�������0
			 
			 System.out.println("����ĳ�����0,�����˳�");
			 System.exit(1);
			
		}
		
	} else {//�������Ĳ�������
		
		System.out.println("������Ĳ�������,�����˳�");
		 System.exit(1);

	}
	 
		System.out.println(String.format("%d/%d=%d", num1));
		System.out.println("��л��ʹ�ñ�����");
}
	
}
