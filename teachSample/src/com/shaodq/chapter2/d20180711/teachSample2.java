package com.shaodq.chapter2.d20180711;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//1  首先分解一个三位数，其中的百、十、个位的数码
		//2 计算这三个数码的立方和
		//3 如果与原始数排除万难相等，则其是一个水仙花数，打印出来
		
		//细化步骤
		//100~999的三位数共有1000个， 我们要检测这1000个数，就要通过循环，将这1000个数取出来用以上规则进行检 测
		for(int i=100;i<1000;i++){
			//要定义三个变量，来保存分解出来的数码
			int bai,shi,ge;
			bai=i/100;
			shi=i%100/10;
			ge=i%10;
			
			/*System.out.println(i+"\t"+bai+"\t"+shi+"\t"+ge);
			if(i>=105){
				break;
			}*/
			
			//计算bai,shi,ge 的立方和
			int sum=bai*bai*bai+shi*shi*shi+ge*ge*ge;
			
			if(i==sum){
				System.out.println(i);
			}
		}
		
		
		
	}

}
