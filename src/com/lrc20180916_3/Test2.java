package com.lrc20180916_3;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack stack=new Stack();  
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
			Car car=new Car(i,"car"+i,"宝马");
			stack.push(car);
		}
		System.out.println("请问第几辆车出站");
		int num=input.nextInt();
		for (int i = 0; i < (10-num); i++) {
			System.out.println("第"+((Car)stack._out()).getId()+"辆车出站");
		}
		
		
		
		
	}

}
