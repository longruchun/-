package com.lrc20180916_3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quee qu =new Quee();  
	     Scanner input=new Scanner(System.in);
	        for (int i = 0; i < 10; i++) {
				Car car=new Car(i,"car"+i,"宝马");
				qu.push(car);
			}
			System.out.println("请问第几辆车过收费站");
			int num=input.nextInt();
			for (int i = 0; i < num; i++) {
				System.out.println("第"+((Car)qu ._out()).getId()+"辆车过收费站");
			}
			
			
			
			
		}

	}


