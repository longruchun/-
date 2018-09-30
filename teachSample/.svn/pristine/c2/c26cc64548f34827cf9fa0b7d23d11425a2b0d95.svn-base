package com.shaodq.chapter2.d20180720;

import java.util.Random;
import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//产生菲波那契数
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入要打印的数组长度:");
		int len=input.nextInt();
		
		long[] fbnq=new long[len];
		
		for(int i=0;i<fbnq.length;i++){
			if(i==0||i==1){
				fbnq[i]=1;
			}else{
				fbnq[i]=fbnq[i-2]+fbnq[i-1];
			}
			System.out.print(fbnq[i]+" ");
			if(i!=0&&i%10==0){
				System.out.println();
			}
		}

	}

}
