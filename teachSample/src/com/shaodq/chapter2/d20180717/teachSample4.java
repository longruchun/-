package com.shaodq.chapter2.d20180717;

import java.util.Scanner;

public class teachSample4 {

	public static void main(String[] args) {
         
		int[] scores;//1 ����
		scores=new int[10];//2  ���䳤��
		//3  ��ֵ����ʹ��
		for(int i=0;i<scores.length;i++){
			scores[i]=80+i;
		}
		
		//4 ���ܿ�ʼʹ��
		//��ѯ��5λͬѧ�ĳɼ�����ӡ
		System.out.println("��5λͬѧ�ĳɼ���:"+scores[4]);
		
		
		int[] heights=new int[10];//�϶�Ϊһ
		
		//����Ϊһ
		int[] weights=new int[]{90,89,75,68,100,112,113,145,95,99};
		
		System.out.println("��5λͬѧ��������:"+weights[4]);
		System.out.println("��5λͬѧ�������:"+heights[4]);
		
		int[] pre3_scores={100,95,99};
		
		
	}


}
