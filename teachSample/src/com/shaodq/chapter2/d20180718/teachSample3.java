package com.shaodq.chapter2.d20180718;

import java.util.Random;
import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
		/**
		 * ��Ŀ����һ��Ͱ�������а��򡢺����100�������Ǳ��밴�����µĹ������ȡ������

         *1��ÿ�δ�Ͱ�����ó���������

         *2�����������ͬɫ���򣬾��ٷ���һ������

         *3�������������ɫ���򣬾��ٷ���һ������

         *�ʣ����Ͱ����ֻʣ��һ������ĸ����Ƕ��٣�
		 */
		
		//��һ��������ģ��ڡ�����---�ٶ�����λ��0�Ǻ���1�ǰ���
		//����ȡ��ģʽ��ȡ��ֻ���������:1 ����   2 ����  3 һ��һ��
		//����ȡ������У� ������һ�֣���ȷ������ȷ��Ҳ��������� ���ԣ����ǿ����ò���
		//�������ģ������ȡ�����:0 ����   1 ����  2 һ��һ��
		//�����Ϲ��򣬶�������
		int[] balls={100,100};
		Random rd=new Random();
		int count=0;
		int oktimes=0;
		while((balls[0]+balls[1])>1){
			count++;
			int getBall=rd.nextInt(3);
			System.out.println(getBall);
			switch(getBall){
			   case 0://ȡ����
				   if(balls[0]>=2){
				      balls[0]-=2;//ȡ��������
				      balls[0]++;//������Ż�һ����
				      oktimes++;
				   }else{
					   System.out.print("\t��Ч�����");
				   }
				   break;
			   case 1://����
				   if (balls[1]>=2) {
					balls[1] -= 2;//ȡ��������
					balls[0]++;//������Ż�һ����
					oktimes++;
				}else{
					   System.out.print("\t��Ч�����");
				   }
				break;
			   case 2://һ��һ��
				   if (balls[0]>=1&&balls[1]>=1) {
					balls[0]--;//ȡ��һ��
					balls[1]--;//ȡ��һ��
					balls[1]++;//����һ��
					oktimes++;
				   }else{
					   System.out.print("\t��Ч�����");
				   }
				break;
			}
		}
		
		if(balls[0]==1){
			System.out.println("����"+count+"��ȡ��,ʣ����");
		}else if(balls[1]==1){
			System.out.println("����"+count+"��ȡ��,ʣ����");
		}else{
			System.out.println("�������"+"����:"+balls[0]+"\t����:"+balls[1]);
		}
	  
	}

}
