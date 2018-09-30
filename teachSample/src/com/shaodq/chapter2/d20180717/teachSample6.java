package com.shaodq.chapter2.d20180717;

import java.util.Scanner;

public class teachSample6 {

	public static void main(String[] args) {
         
		//查找算法
		int[] arrs={8,4,2,1,23,344,12};
		
		Scanner input=new Scanner(System.in);
		System.out.println("从键 盘输入一个数:");
		int num=input.nextInt();
		int i=0;
		for(;i<arrs.length;i++){
			if(arrs[i]==num){
				break;
			}
		}
		
		if(i==arrs.length){
			System.out.println("你输入的数，不包含 在数组中");
		}else{
			System.out.println("你输入的数在数组第"+i+"个位置出现");
		}
	}


}
