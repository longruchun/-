package com.shaodq.chapter1.d20180706;

import java.util.Scanner;

public class teachSample_8 {

	public static void main(String[] args) {
		//��Ԥ�������ҵ���н����15�򣬲���ÿ����0.8%���ٶ�����������3���Ժ��ҵ�н�� �Ƕ���
		
		double salary=15;//��¼��ʼֵ
		double rate=0.008;
		
		int year=0;//��¼����������
		
		
			//������һ��
			year++;
			salary += salary * rate;
			System.out.println("����" + year + "�꣬н����:" + salary);
			
			
			//�����ڶ���
			year++;
			salary += salary * rate;
			System.out.println("����" + year + "�꣬н����:" + salary);
			
			//����������
			year++;
			salary += salary * rate;
			System.out.println("����" + year + "�꣬н����:" + salary);
			if (salary >= 20) {
				return;
			} 

	}

}
