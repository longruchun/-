package com.shaodq.chapter2.d20180717;

import java.util.Scanner;

public class teachSample5 {

	public static void main(String[] args) {
         
		//由键盘录入5个同学的成绩，存入数组，并计算5位同学的平均分
		Scanner input=new Scanner(System.in);
		
		int[] scores=new int[5];
		int sum=0;
		
		for(int i=0;i<scores.length;i++){
			System.out.println("请输入第"+(i+1)+"位同学的成绩:");
			scores[i]=input.nextInt();
			//sum+=input.nextInt();
			sum+=scores[i];
		}
		
		System.out.println("以下是"+scores.length+"位同学的成绩:");
		for(int i=0;i<scores.length;i++){
			System.out.print(scores[i]+"\t");
		}
		
		System.out.println(scores.length+"位同学平均分是:"+(sum/scores.length));
		
		
	}


}
