package com.shaodq.chapter2.d20180723;

import java.util.Arrays;
import java.util.Scanner;


public class teachSample7 {

	public static void main(String[] args) {
        //��ʵ����:��ʦ��С����д50��"�������"��javaʵ�ִ���
		//����ÿһ�鳭д���� ���ܶ���ʼ���ظ�������С���ܷ�������һ�����취�أ�
		//��java�����磬 ������ѭ �����Լ�������� 
		/*int i=0;
		for(;;){
			System.out.println("������Ǵ���");
			i++;
			
			if(i>=50){
				break;
			}
		}
		
		System.out.println("ѭ��������ĵ�һ�����.");*/
		
		Scanner input=new Scanner(System.in);
		String answer="";
		do{
			System.out.println("����ɺ�����������.");
			System.out.println("������ʣ��ϸ�����?(y Or n)");
			answer=input.next();
		}while("n".equals(answer));//answer.equals("n");
	}

}
