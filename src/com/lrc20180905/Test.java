package com.lrc20180905;

import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		switch (input.nextInt()) {
		case 1:
			System.out.print("��ѡ�񹷹���Ʒ��:(1����������������Ȯ" +
					" 2������ѩ����)");
			String strain =null;
			if (input.nextInt() == 1) {
				strain = "��������������Ȯ";
			} else {
				strain = "����ѩ����";
			}
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			dog.print();
			break;
		case 2:
			
			System.out.print("��ѡ�������Ա𣺣�1��Q�� 2��Q�ã�");
			String sex = null;
			if (input.nextInt() == 1)
				sex = "Q��";
			else
				sex = "Q��";
			
			Penguin pgn = new Penguin();
			pgn.name = name;
			pgn.sex = sex;
		
		}
	}
}
