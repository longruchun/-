package com.shaodq.chapter2.d20180719;

import java.util.Random;
import java.util.Scanner;

public class teachSample4 {

	public static void main(String[] args) {
		/**
		 * @param args
		 * 目标：老师先给10个小孩一定量的糖，然后小孩分一半给右边的小孩，糖数为奇数的老师给一颗，求一样多时的次数及糖数
		 */
		
		//1  定义一个数组，存放小孩手中的糖，为便于讲课， 我称这个数组为"全糖"数组
		int[] init=new int[10];//随机数最初产生的糖 数
		
		
		int[] all_candy=new int[10];
		int[] half_candy=new int[10];
		
		int count=0;
		
		//2 随机产生1-15的数值，为"全糖"数组赋初值
		Random rd=new Random();
		for(int i=0;i<all_candy.length;i++){
			init[i]=(rd.nextInt(20)+1);//产生糖 数，记入init数组
			all_candy[i]=init[i];//同时记入"全糖 "数组
			
		}
		
		while(juge(all_candy)){
			
			
 
			
			count++;//计数器记录一次分配
			//3      对全糖数组 判断每个索引处的糖数是否为偶数
			for(int i=0;i<all_candy.length;i++){
				if(all_candy[i]%2!=0){
					all_candy[i]+=1;//老师给加一颗糖 ,使其为偶数，能平分为二份
				}
				half_candy[i]=all_candy[i]/2;//计算半糖 数目赋值给半糖 数组
				
				all_candy[i]=half_candy[i];//全糖 数组中有一半糖已分去了半糖 数组
			}
			
			
			//4 开始传递 糖 ---错位赋值
			for(int j=0;j<all_candy.length;j++){
				if(j!=all_candy.length-1){
					all_candy[j+1]=all_candy[j+1]+half_candy[j];
				}else{
					//最大索引位置 小孩的糖 传给 0 位置小孩
					all_candy[0]=all_candy[0]+half_candy[all_candy.length-1];
				}
			}
		}
		
		System.out.println("初始时小孩手中的糖的分布情况是:");
		for(int i=0;i<init.length;i++){
			System.out.print(i+"号 : "+init[i]+"\t");
		}
		System.out.println();
		System.out.println("经过"+count+"次分配，所有小孩手中的糖变成:");
		for(int i=0;i<all_candy.length;i++){
			System.out.print(i+"号 : "+all_candy[i]+"\t");
		}
		
	}
	
	
		public static boolean juge(int[] all_candy){
			//首先判断糖数是否已一致，若一致则break;
			boolean flag=true;
			for(int i=0;i<all_candy.length-1;i++){
				if(all_candy[i]!=all_candy[i+1]){
					flag=false;
					break;
				}
			}
			return flag;
		}
	
   
    
    
    
}
