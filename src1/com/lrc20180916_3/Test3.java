package com.lrc20180916_3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quee qu =new Quee();  
	     Scanner input=new Scanner(System.in);
	        for (int i = 0; i < 10; i++) {
				Car car=new Car(i,"car"+i,"����");
				qu.push(car);
			}
			System.out.println("���ʵڼ��������շ�վ");
			int num=input.nextInt();
			for (int i = 0; i < num; i++) {
				System.out.println("��"+((Car)qu ._out()).getId()+"�������շ�վ");
			}
			
			
			
			
		}

	}


