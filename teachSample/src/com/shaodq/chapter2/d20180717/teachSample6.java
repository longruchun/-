package com.shaodq.chapter2.d20180717;

import java.util.Scanner;

public class teachSample6 {

	public static void main(String[] args) {
         
		//�����㷨
		int[] arrs={8,4,2,1,23,344,12};
		
		Scanner input=new Scanner(System.in);
		System.out.println("�Ӽ� ������һ����:");
		int num=input.nextInt();
		int i=0;
		for(;i<arrs.length;i++){
			if(arrs[i]==num){
				break;
			}
		}
		
		if(i==arrs.length){
			System.out.println("����������������� ��������");
		}else{
			System.out.println("����������������"+i+"��λ�ó���");
		}
	}


}
