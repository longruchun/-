package com.shaodq.chapter2.d20180717;

import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
         
		int rows=10;
		int cols=60;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(i==0||i==rows-1){
					System.out.print("*");
				}else{
					if(j==0||j==cols-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			
			System.out.println("");
		}
		
	}


}
