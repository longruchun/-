package com.shaodq.chapter2.d20180725;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//菲波那契 不用数组的实现方式
		//1 1 2 3 5 8 13  21  34  55
		//f  代表第一个数     s  代表第二个数
		//每次f+s 得到一个菲波那契数,然后fs版块向右平移，原先的s变成新的f,生成的菲波那契数变成新的s 
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要生成的个数:");
		
		int len=input.nextInt();
		
		int f=1;
		int s=1;
		
		for(int i=0;i<len;i++){
			if(i==0||i==1){
				System.out.print(1+" ");
			}else{
				int fbnq=s+f;
				System.out.print(fbnq+" ");
				f=s;
				s=fbnq;
			}
		}
		
	}

}
