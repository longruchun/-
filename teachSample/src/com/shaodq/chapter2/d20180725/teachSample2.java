package com.shaodq.chapter2.d20180725;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//�Ʋ����� ���������ʵ�ַ�ʽ
		//1 1 2 3 5 8 13  21  34  55
		//f  �����һ����     s  ����ڶ�����
		//ÿ��f+s �õ�һ���Ʋ�������,Ȼ��fs�������ƽ�ƣ�ԭ�ȵ�s����µ�f,���ɵķƲ�����������µ�s 
		
		Scanner input=new Scanner(System.in);
		System.out.println("������Ҫ���ɵĸ���:");
		
		int len=input.nextInt();
		
		int f=1;
		int s=1;
		
		for(int i=0;i<len;i++){
			if(i==0||i==1){
				System.out.print(1+" ");
			}else{
				int fbnq=s+f;
				System.out.print(fbnq+" ");
				f=s;
				s=fbnq;
			}
		}
		
	}

}
