package com.shaodq.chapter2.d20180718;

import java.util.Random;
import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
		/**
		 * 题目：有一个桶，里面有白球、黑球各100个，人们必须按照以下的规则把球取出来：

         *1、每次从桶里面拿出来两个球；

         *2、如果是两个同色的球，就再放入一个黑球；

         *3、如果是两个异色的球，就再放入一个白球；

         *问：最后桶里面只剩下一个黑球的概率是多少？
		 */
		
		//用一个数组来模拟黑、白球---假定索引位置0是黑球，1是白球
		//分析取球模式：取球只有三种情况:1 两黑   2 两白  3 一黑一白
		//三种取球情况中， 会是哪一种，不确定，不确定也就是随机， 所以，我们可以用产生
		//随机数来模拟三种取球情况:0 两黑   1 两白  2 一黑一白
		//按以上规则，丢球，留球
		int[] balls={100,100};
		Random rd=new Random();
		int count=0;
		int oktimes=0;
		while((balls[0]+balls[1])>1){
			count++;
			int getBall=rd.nextInt(3);
			System.out.println(getBall);
			switch(getBall){
			   case 0://取两黑
				   if(balls[0]>=2){
				      balls[0]-=2;//取走两黑球
				      balls[0]++;//按规则放回一黑球
				      oktimes++;
				   }else{
					   System.out.print("\t无效随机数");
				   }
				   break;
			   case 1://两白
				   if (balls[1]>=2) {
					balls[1] -= 2;//取走两白球
					balls[0]++;//按规则放回一黑球
					oktimes++;
				}else{
					   System.out.print("\t无效随机数");
				   }
				break;
			   case 2://一黑一白
				   if (balls[0]>=1&&balls[1]>=1) {
					balls[0]--;//取出一黑
					balls[1]--;//取出一白
					balls[1]++;//放入一白
					oktimes++;
				   }else{
					   System.out.print("\t无效随机数");
				   }
				break;
			}
		}
		
		if(balls[0]==1){
			System.out.println("经过"+count+"次取球,剩黑球");
		}else if(balls[1]==1){
			System.out.println("经过"+count+"次取球,剩白球");
		}else{
			System.out.println("解题出错"+"黑球:"+balls[0]+"\t白球:"+balls[1]);
		}
	  
	}

}
