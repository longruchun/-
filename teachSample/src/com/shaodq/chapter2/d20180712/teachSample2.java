package com.shaodq.chapter2.d20180712;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//���������ִ��һ�Σ��ܹ�Ȩִ�ж��ٴΣ�����Ԥ֪
		//����do---whileѭ ��,ע�������﷨��ʽ
		Scanner input=new Scanner(System.in);
		boolean isOk;
		
		do{
			System.out.println("���ʦ������.");
			System.out.println("�ϸ�����?");
			isOk=input.nextBoolean();
		}while(!isOk);
		
		System.out.println("����ȥɽ����.");
	}

}
