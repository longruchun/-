package com.shaodq.chapter2.d20180716;

import java.util.Scanner;

public class teachSample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //输入一个十进制数转化为二进制数。
		Scanner input=new Scanner(System.in);
		
		System.out.println("请任意输入一个数值:");
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
		
		System.out.println("十进制数："+num+" 转换为二进制数是:"+total);
		
		
	}

}
