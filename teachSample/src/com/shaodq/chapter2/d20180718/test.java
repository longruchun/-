package com.shaodq.chapter2.d20180718;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1   input.nextLine()
		//2   ����������֮��ĸ�ֵ
		
		Scanner input=new Scanner(System.in);
		
		/*System.out.println("���ɼ�������һ���ɿո�ָ����ַ���������ӡ���:");
		String _receive=input.nextLine();
		System.out.println("���������:"+_receive);*/
		
		//��ʾ�Ӽ�������������ֵ����ӡ���������0ʾ��������
		int i=1;
		do{
			System.out.println("������һ����ֵ(����0ʾ�����):");
			if(input.hasNextInt()){
			   i=input.nextInt();
			   System.out.println(i);
			}else{
			   System.out.println("���벻ƥ��");
			   input=new Scanner(System.in);

			}
			

			
		}while(i!=0);
		
		System.out.println("����");
		
	}

}
