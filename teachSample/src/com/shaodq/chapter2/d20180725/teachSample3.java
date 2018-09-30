package com.shaodq.chapter2.d20180725;

import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
		int[][] scores={{100,98,87,79},{98,99,86,78},{88,85,96,100}};
		
		int sum=0;
		int bigThan80=0;
		for(int i=0;i<scores.length;i++){
			sum=0;
			for(int j=0;j<scores[i].length;j++){
				sum+=scores[i][j];
				/*if(scores[i][j]<80){
					continue;
				}
				bigThan80++;*/
				
				if(scores[i][j]>80){
					bigThan80++;
				}
			}
			
			System.out.println("第"+(i+1)+"个班级四个学员平均分是:"+(sum/4));
		}
		
	}

}
