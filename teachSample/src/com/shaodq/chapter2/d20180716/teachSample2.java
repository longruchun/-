package com.shaodq.chapter2.d20180716;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//老师让小明统计全班前十名以内的平均分，以及分数在85上的有几人?
		Scanner input =new Scanner(System.in);
		double score=0;
		double sum=0;
		int count=0;
		for(int i=0;i<10;i++){
			System.out.println("请录入第"+(i+1)+"位同学的成绩:");
			score=input.nextDouble();
			sum+=score;//统计总分
			
			if(score<85){
				continue;
			}
			
			count++;
		}
		
		
		
		
		
		
	}

}
