package com.shaodq.chapter2.d20180726;

import java.util.Scanner;

public class testVisitor {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int count=0;
		while (true) {
			count++;
			System.out.println("��"+count+"λ�ο͹�Ʊ:");
			Visitor vist = new Visitor();
			
			System.out.println("��������������");
			vist.name=input.next();
			System.out.println("��������:");
			vist.age=input.nextInt();
			
			vist.buyTicket();
			
			System.out.println("�����ο�Ҫ��Ʊ��?(y Or n)");
			
			if(input.next().equals("n")){
				break;//�����Ŷӹ�Ʊ���οͣ��˳���Ʊѭ ��
			}
			
			
		}
		
		System.out.println("�� �����,ллʹ��.");
        
	}

}
