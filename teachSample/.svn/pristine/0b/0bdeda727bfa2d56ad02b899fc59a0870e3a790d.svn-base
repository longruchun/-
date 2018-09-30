package com.shaodq.chapter2.d20180712;

import java.util.Scanner;

public class teachSample6 {

	public static void main(String[] args) {
		
		//第几台阶（层）,被乘数就是台阶数
		//每个台阶内，乘数的下限是1，成数的上限就是当前台阶数
		
		/*for(int i=1;i<=9;i++){
			
			for(int j=i;j>=1;j--){
				System.out.print(j+" × "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
			
		}*/
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要打印的数塔的层数:");
		int rows=input.nextInt();
		
		/*for(int i=1;i<=rows;i++){
			//构造一个内层循 环打印空格
			for(int j=1;j<(rows-i);j++){
				System.out.print("\t");
			}
			//再构造一个内层循 环打印数字
			for(int k=1;k<=i;k++){
				System.out.print(i+"\t");
			}
			
			System.out.println();
			
			
		}*/
		
		/*for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++){
				if (j%2!=0) {
					System.out.print("★");
				}else{
					System.out.print("☆");
				}
			}
			System.out.println();
		}*/
		
		
		//通过行数， 计算总列数
		int cols=2*rows-1;
		int xiu=rows-1;
		for(int i=0;i<rows;i++){
			//System.out.print("\t\t");
			for(int j=0;j<cols;j++){//打每行的空格及星号
				if(j>=xiu-i&&j<=xiu+i){
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
			
			/*for(int k=0;k<cols;k++){
				System.out.print(" ");
			}*/
			
			for(int j=0;j<cols;j++){//打每行的空格及星号
				if(j>=xiu-i&&j<=xiu+i){
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
			
			/*for(int k=0;k<cols;k++){
				System.out.print(" ");
			}*/
			
			for(int j=0;j<cols;j++){//打每行的空格及星号
				if(j>=xiu-i&&j<=xiu+i){
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<cols;j++){//打每行的空格及星号
				if(j>=xiu-i&&j<=xiu+i){
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<cols;j++){//打每行的空格及星号
				if(j>=xiu-i&&j<=xiu+i){
					System.out.print("*");
					
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		
		}
		
		//打倒的那个三角形
		
		for(int i=rows-2;i>=0;i--){
			//System.out.print("\t\t");
			for(int j=cols;j>=0;j--){//打每行的空格及星号
				if(j>=(rows-i)&&j<=(rows+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			/*for(int k=0;k<cols-1;k++){
				System.out.print(" ");
			}*/
			for(int j=cols-1;j>=0;j--){//打每行的空格及星号
				if(j>=(rows-i)&&j<=(rows+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			/*for(int k=0;k<cols-1;k++){
				System.out.print(" ");
			}*/
			for(int j=cols-1;j>=0;j--){//打每行的空格及星号
				if(j>=(rows-i)&&j<=(rows+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int j=cols-1;j>=0;j--){//打每行的空格及星号
				if(j>=(rows-i)&&j<=(rows+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int j=cols-1;j>=0;j--){//打每行的空格及星号
				if(j>=(rows-i)&&j<=(rows+i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
		
	}

}
