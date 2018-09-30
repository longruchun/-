package com.shaodq.chapter2.d20180725;

import java.util.Scanner;

public class teachSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //杨辉三角，历史上有多种解题方案，我们采用二维数组、二重循 环的方式解题，基本思路是:
		//根据杨辉三角的数的构造 规律，先计算出所有的数，按对应位置存入二维数组
		//然后，遍历二维数组，打印结果.
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要打印的行数:");
		
		int rows=input.nextInt();
		int cols=2*rows-1;
		
		long[][] yh=new long[rows][cols];
		
		//开始遍历数组，开始循 环计算并赋值
		for(int i=0;i<yh.length;i++){
			for(int j=0;j<yh[i].length;j++){
				if(j==(rows-1-i)||j==(rows-1+i)){
					yh[i][j]=1;
				}else if(j>(rows-1-i)&&j<(rows-1+i)){
					if((j-(rows-1-i))%2==0){
						//该位置就不是空格，而是数字位，值是肩上两个数的和
						yh[i][j]=yh[i-1][j-1]+yh[i-1][j+1];
					}
				}
			}
		}
		
		//打印
		for(int i=0;i<yh.length;i++){
			for(int j=0;j<yh[i].length;j++){
				if(yh[i][j]==0){
					System.out.print("  ");
				}else{
					System.out.print(yh[i][j]+" ");
				}
			}
			
			System.out.println();
		}
		
		for(int i=yh.length-2;i>=0;i--){
			for(int j=0;j<yh[i].length;j++){
				if(yh[i][j]==0){
					System.out.print("  ");
				}else{
					System.out.print(yh[i][j]+" ");
				}
			}
			
			System.out.println();
		}
			
		
	}

}
