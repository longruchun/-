package com.shaodq.chapter1.d20180707;


import java.util.Scanner;

public class teachSample_3 {

	public static void main(String[] args) {
	   Scanner input =new Scanner(System.in);
	   //ԭʼ���ݲɼ� 	
	   System.out.println("������������������");
	   System.out.print("a:");
	   int a=input.nextInt();
	   System.out.print("b:");
	   int b=input.nextInt();
	   System.out.print("c:");
	   int c=input.nextInt();
	   System.out.println("����ǰ:a="+a+"\tb="+b+"\tc="+c);
	   //��������
	   //��һ�αȽϣ�a:b
	   if(a>b){
		   int temp=a;
		   a=b;
		   b=temp;
	   }else if(a>c){//�ڶ��αȽϣ�a:c
		   int temp=a;
		   a=c;
		   c=temp;
	   }else if(b>c){//�����αȽ�b:c
		   int temp=b;
		   b=c;
		   c=temp;
	   }
	   
	   
	   
	   
	   System.out.println("�����:a="+a+"\tb="+b+"\tc="+c);
	}
	
	
	

}
