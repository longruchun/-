package com.shaodq.chapter2.d20180718;

import java.util.Random;
import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//有12个球，其中有一个与其它的重量不一样，如何通过最多三次称重，找出那个重量不同的球
		int[] balls={10,10,10,10,10,10,10,10,10,10,10,10};
		//为了增加题的趣味性，那个不一样重的球的位置， 我用随机数产生
		Random rd=new Random();
		int position=rd.nextInt(12);
		balls[position]=11;
		//第一次称重:前10个元素分两组上称
		int left=balls[0]+balls[1]+balls[2]+balls[3]+balls[4];
		int right=balls[5]+balls[6]+balls[7]+balls[8]+balls[9];
		
		if(left==right){
			left=balls[10];
			right=balls[11];
			
			if(left>right){
				System.out.println("10号球是11克重的球"+"验证:"+position);
			}else{
				System.out.println("11号球是11克重的球"+"验证:"+position);
			}
			
		}else if(left>right){
			left=balls[0]+balls[1];
			right=balls[2]+balls[3];
			
			if(left==right){
				System.out.println("4号球是11克重的球"+"验证:"+position);
			}else if(left>right){
				left=balls[0];
				right=balls[1];
				
				if(left>right){
					System.out.println("0号球是11克重的球"+"验证:"+position);
				}else{
					System.out.println("1号球是11克重的球"+"验证:"+position);
				}
			}else if(left<right){
				left=balls[2];
				right=balls[3];
				
				if(left>right){
					System.out.println("2号球是11克重的球"+"验证:"+position);
				}else{
					System.out.println("3号球是11克重的球"+"验证:"+position);
				}
			}
		}else if(left<right){
			left=balls[5]+balls[6];
			right=balls[7]+balls[8];
			
			if(left==right){
				System.out.println("9号球是11克重的球"+"验证:"+position);
			}else if(left>right){
				left=balls[5];
				right=balls[6];
				
				if(left>right){
					System.out.println("5号球是11克重的球"+"验证:"+position);
				}else{
					System.out.println("6号球是11克重的球"+"验证:"+position);
				}
			}else if(left<right){
				left=balls[7];
				right=balls[8];
				
				if(left>right){
					System.out.println("7号球是11克重的球"+"验证:"+position);
				}else{
					System.out.println("8号球是11克重的球"+"验证:"+position);
				}
			}
			
			
			
		}
			
			
	  
	}

}
