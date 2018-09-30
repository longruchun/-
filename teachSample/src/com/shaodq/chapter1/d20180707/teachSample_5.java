package com.shaodq.chapter1.d20180707;


import java.util.Random;
import java.util.Scanner;

public class teachSample_5 {

	public static void main(String[] args) {
		   /*Scanner input =new Scanner(System.in);
		   //键盘输入任意一个十进制数，将之转为二进制字符串输出
		   System.out.println("请任意输入一个整 型数:");
		   int num=input.nextInt();
		   System.out.println("十进制数:"+num+",转化为二进制是:"+Integer.toBinaryString(num));*/
		   
		   Random rd=new Random();
		   int num=0;
		   int i=0;
		   int m;
		   String _binary="";//用来记录产生的0和1，让他们组成一个二进制字符串
		   while(i<8){
			   i++;
			   m=8-i;
			   int _bit=rd.nextInt(2);
			   _binary+=_bit;
			   //System.out.println(rd.nextInt(2));
			   //"01001001"=>0*2(7)+1*2(6)+0*2(5)+0*2(4)+1*2(3)+0*2(2)+0*2(1)+1*2(0)
			   num+=(int)(_bit*Math.pow(2,m));
		   }
		   
		   System.out.println("二进制数: "+_binary+" 转化为十进制是:"+num);
	}
	
	
	

}
