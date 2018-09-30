package com.shaodq.chapter2.d20180725;

import java.util.Random;
import java.util.Scanner;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //二维数组执行查找算法
		//1. 我们声明一个整型的 [10][10]的二维数组---意思是:一维有10 个元素，一维的十个元素格子中
		//   存放的都 是一个长度为10的整 型数组
		int[][] arrs=new int[10][10];
		//我们要使用随机数产生器，就要在循 环外面先定义好，不要在循环中定义，那样程序运行效率会低，
		//因为每次循 环都 会执行一次定义的低码
		Random rd=new Random();
		//2. 我们利用二重循环，遍历二维数组，并通过产生0-99人随机数为元素赋值
		
		//需求扩展：在原有功能基础上，我们改进需求：不是找输入的数二维数组中有没有，而是找这个数在二维数组中有几个
		//分别出现在什么行、什么列,用一个二维数组来记录该数出现的位置坐标,为了记录元素位置坐标， 我们定义一个新的二维数组
		//考虑极端情形，可能100个元素都是你要找的， 所以数组长度为100
		
		String[] position=new String[100];
		
		
		
		for(int i=0;i<arrs.length;i++){
			int[] elements=new int[10];
			for(int j=0;j<arrs[i].length;j++){
		   		//arrs[i][j]=rd.nextInt(100);
		   		//给同学演示另一种写法
		   		//先定义一个数组，作为要存放到一维的单元格中去的数组
		   		elements[j]=rd.nextInt(100);
		   		
		   		System.out.print(elements[j]+" ");
		   	}
			
			arrs[i]=elements;
			System.out.println();
		}
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要查找的数值:");
		int num=input.nextInt();
		
		
		int count=0;
		for(int i=0;i<arrs.length;i++){
			for(int j=0;j<arrs[i].length;j++){
				if(arrs[i][j]==num){
					//(i,j)
					String str="("+i+","+j+")";
					position[count++]=str;
					//count++;
				}
			}

		}
		
		if(count>0){//说明至少找到了一个， 才有遍历的必要
			System.out.println("您输入的数:"+num+",在二维数组中以下坐标位置找到");
			for(int i=0;i<count;i++){
				System.out.println(position[i]);
			}
		}
		
			
			
		
	}

}
