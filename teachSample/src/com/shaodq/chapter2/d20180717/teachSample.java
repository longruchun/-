package com.shaodq.chapter2.d20180717;

import java.util.Scanner;

public class teachSample {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		while (true) {
			System.out.println("*************************");
			System.out.println("*\t1 ��¼ϵͳ");
			System.out.println("*\t2 ѡ����Ʒ");
			System.out.println("*\t3 �������");
			System.out.println("*\t4 ��         ��");
			System.out.println("*\t5 ��         ��");
			System.out.println("*************************");
			System.out.println("��ѡ��(1-5)��");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("����ѡ��\"��¼ϵͳ\"");
				continue;
			case 2:
				System.out.println("����ѡ��\"ѡ����Ʒ\"");
				continue;
			case 3:
				System.out.println("����ѡ��\"�������\"");
				continue;
			case 4:
				System.out.println("����ѡ��\"��         ��\"");
				continue;
			case 5:
				System.out.println("����ѡ��\"��         ��\"");
				break;
			default:
				System.out.println("ѡ�����");
				continue;
			}
			
			break;
		}
		
		System.out.println("лл���٣�");
       
	}


}
