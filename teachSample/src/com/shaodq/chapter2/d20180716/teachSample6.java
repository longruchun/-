package com.shaodq.chapter2.d20180716;

import java.util.Scanner;

public class teachSample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����һ��ʮ������ת��Ϊʮ����������
		Scanner input=new Scanner(System.in);
		
		System.out.println("����������һ����ֵ:");
		int num=input.nextInt();
		int _num=num;
		
		int _bit;
		String code="";//���������_bit תΪ code(1 -> f)
		
		String total="";
		
		while(true){
			_bit=_num%16;
			
			code=digit2code(_bit);
			
			total=code+total;
			
			_num=_num/16;
			
			
			if(_num<16){
				_bit=_num;
				//******
				code=digit2code(_bit);
				
				total=code+total;
				//******
				
				break;
			}
		}
		
		System.out.println("ʮ��������"+num+" ת��Ϊʮ����������:"+total);

	}

	private static String digit2code(int _bit) {
		
		String code="";
		if(_bit<=9){
			code=""+_bit;
		}else{
			switch(_bit){
				case 10:
					code="a";
					break;
				case 11:
					code="b";
					break;
				case 12:
					code="c";
					break;
				case 13:
					code="d";
					break;
				case 14:
					code="e";
					break;
				case 15:
					code="f";
					break;
			}
		}
		return code;
	}

}
