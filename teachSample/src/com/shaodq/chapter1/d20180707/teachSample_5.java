package com.shaodq.chapter1.d20180707;


import java.util.Random;
import java.util.Scanner;

public class teachSample_5 {

	public static void main(String[] args) {
		   /*Scanner input =new Scanner(System.in);
		   //������������һ��ʮ����������֮תΪ�������ַ������
		   System.out.println("����������һ���� ����:");
		   int num=input.nextInt();
		   System.out.println("ʮ������:"+num+",ת��Ϊ��������:"+Integer.toBinaryString(num));*/
		   
		   Random rd=new Random();
		   int num=0;
		   int i=0;
		   int m;
		   String _binary="";//������¼������0��1�����������һ���������ַ���
		   while(i<8){
			   i++;
			   m=8-i;
			   int _bit=rd.nextInt(2);
			   _binary+=_bit;
			   //System.out.println(rd.nextInt(2));
			   //"01001001"=>0*2(7)+1*2(6)+0*2(5)+0*2(4)+1*2(3)+0*2(2)+0*2(1)+1*2(0)
			   num+=(int)(_bit*Math.pow(2,m));
		   }
		   
		   System.out.println("��������: "+_binary+" ת��Ϊʮ������:"+num);
	}
	
	
	

}
