package com.shaodq.chapter1.d20180707;


import java.util.Scanner;

public class teachSample_4 {

	public static void main(String[] args) {
		   Scanner input =new Scanner(System.in);
		   int Max;//����һ�������������ֵ
		   //ԭʼ���ݲɼ� 	
		   System.out.println("������������������");
		   System.out.print("a:");
		   int a=input.nextInt();
		   Max=a;
		   
		   
		   System.out.print("b:");
		   int b=input.nextInt();
		   if(b>Max){
			   Max=b;
		   }
		   
		   
		   
		   System.out.print("c:");
		   int c=input.nextInt();
		   if(c>Max){
			   Max=c;
		   }
		   
		   
		   System.out.println("�������е����ֵ�ǣ�"+Max);
		   //��������
	}
	
	
	

}
