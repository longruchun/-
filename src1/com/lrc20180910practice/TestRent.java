package com.lrc20180910practice;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {		
		String no;
		String brand ;
		String mtype;
		String type;			
		int seatCount;
		int days;
	    int rent;
		Car car;
		Bus bus;
		
		Scanner input = new Scanner(System.in);		
		System.out.println("��ӭ�����������޹�˾��");
		System.out.print("������Ҫ���޵�������");
		days=input.nextInt();	
		System.out.print("������Ҫ���޵��������ͣ�1���γ�      2���ͳ���:");
		mtype = input.next();
		
	
		if("1".equals(mtype)){
			
			System.out.print("��ѡ��Ҫ��ĳ��ͣ�1������    2����ˣ�:");
			brand=input.next();
			System.out.print("������γ����ͺ� ");
			if("1".equals(brand)) {
				System.out.print("1��550i��");
			}
			else {
				System.out.print("2��GL8  3��������");
			}
			
			
			type=input.next();
			no="�FA5543";//�������ֱ��ָ�������ƺ�
			System.out.println("��������������ƺ���:"+no);
			car =new Car(no,brand,type);
			rent=car.calRent(days);
			
		}else{
			
			System.out.print("������Ҫ���޵Ŀͳ�Ʒ�ƣ�1���� 2��������:");
			brand=input.next();
			System.out.print("������ͳ�����λ��:");
			seatCount=input.nextInt();
			no="��AU8769";//�������ֱ��ָ�������ƺ�
			System.out.println("��������������ƺ���:"+no);
			bus=new Bus(no,brand,seatCount);
			rent=bus.calRent(days);
			
		}		
		
		System.out.println("\n�˿����ã�����Ҫ֧�������޷�����"+rent+"��");
			

	}
}
