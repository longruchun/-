package com.shaodq.chapter2.d20180711;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//1  ���ȷֽ�һ����λ�������еİ١�ʮ����λ������
		//2 ���������������������
		//3 �����ԭʼ���ų�������ȣ�������һ��ˮ�ɻ�������ӡ����
		
		//ϸ������
		//100~999����λ������1000���� ����Ҫ�����1000��������Ҫͨ��ѭ��������1000����ȡ���������Ϲ�����м� ��
		for(int i=100;i<1000;i++){
			//Ҫ��������������������ֽ����������
			int bai,shi,ge;
			bai=i/100;
			shi=i%100/10;
			ge=i%10;
			
			/*System.out.println(i+"\t"+bai+"\t"+shi+"\t"+ge);
			if(i>=105){
				break;
			}*/
			
			//����bai,shi,ge ��������
			int sum=bai*bai*bai+shi*shi*shi+ge*ge*ge;
			
			if(i==sum){
				System.out.println(i);
			}
		}
		
		
		
	}

}
