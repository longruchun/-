package com.shaodq.chapter2.d20180720;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class teachSample4 {

	public static void main(String[] args) {
		int[] arr={101,23,55,190,321,88,65,73,21,12,15};
		
		/*Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}*/
		
		//冒泡排序---
		//n个数值来排序
		//两两比较小靠前
		//n个数据n-1轮
		
		//外层循 环循环轮
		for(int i=0;i<arr.length-1;i++){
			//内层循环两两比较
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+" ");
				
			}
			System.out.println();
		}
		//打印
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
	}

}
