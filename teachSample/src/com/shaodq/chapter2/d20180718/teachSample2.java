package com.shaodq.chapter2.d20180718;

import java.util.Random;
import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//��12����������һ����������������һ�������ͨ��������γ��أ��ҳ��Ǹ�������ͬ����
		int[] balls={10,10,10,10,10,10,10,10,10,10,10,10};
		//Ϊ���������Ȥζ�ԣ��Ǹ���һ���ص����λ�ã� �������������
		Random rd=new Random();
		int position=rd.nextInt(12);
		balls[position]=11;
		//��һ�γ���:ǰ10��Ԫ�ط������ϳ�
		int left=balls[0]+balls[1]+balls[2]+balls[3]+balls[4];
		int right=balls[5]+balls[6]+balls[7]+balls[8]+balls[9];
		
		if(left==right){
			left=balls[10];
			right=balls[11];
			
			if(left>right){
				System.out.println("10������11���ص���"+"��֤:"+position);
			}else{
				System.out.println("11������11���ص���"+"��֤:"+position);
			}
			
		}else if(left>right){
			left=balls[0]+balls[1];
			right=balls[2]+balls[3];
			
			if(left==right){
				System.out.println("4������11���ص���"+"��֤:"+position);
			}else if(left>right){
				left=balls[0];
				right=balls[1];
				
				if(left>right){
					System.out.println("0������11���ص���"+"��֤:"+position);
				}else{
					System.out.println("1������11���ص���"+"��֤:"+position);
				}
			}else if(left<right){
				left=balls[2];
				right=balls[3];
				
				if(left>right){
					System.out.println("2������11���ص���"+"��֤:"+position);
				}else{
					System.out.println("3������11���ص���"+"��֤:"+position);
				}
			}
		}else if(left<right){
			left=balls[5]+balls[6];
			right=balls[7]+balls[8];
			
			if(left==right){
				System.out.println("9������11���ص���"+"��֤:"+position);
			}else if(left>right){
				left=balls[5];
				right=balls[6];
				
				if(left>right){
					System.out.println("5������11���ص���"+"��֤:"+position);
				}else{
					System.out.println("6������11���ص���"+"��֤:"+position);
				}
			}else if(left<right){
				left=balls[7];
				right=balls[8];
				
				if(left>right){
					System.out.println("7������11���ص���"+"��֤:"+position);
				}else{
					System.out.println("8������11���ص���"+"��֤:"+position);
				}
			}
			
			
			
		}
			
			
	  
	}

}
