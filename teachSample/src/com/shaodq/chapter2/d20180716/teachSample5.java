package com.shaodq.chapter2.d20180716;

import java.util.Scanner;

public class teachSample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����һ��ʮ������ת��Ϊ����������
		Scanner input=new Scanner(System.in);
		
		System.out.println("����������һ����ֵ:");
		int num=input.nextInt();
		int _num=num;
		
		int _bit;
		
		/*for(;;){
			
		}*/
		
		String total="";
		
		while(true){
			_bit=_num%2;
			total=_bit+total;
			
			_num=_num/2;
			
			
			if(_num==1){
				total=1+total;
				break;
			}
		}
		
		System.out.println("ʮ��������"+num+" ת��Ϊ����������:"+total);
		
		
	}

}
