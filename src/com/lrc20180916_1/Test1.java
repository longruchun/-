package com.lrc20180916_1;



import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test1 {
	
	
	public static Logger logger=Logger.getLogger(Test1.class.getName());
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
		System.out.println("请输入被除数");
		int num1=input.nextInt();
		 logger.debug("除数");
		 System.out.println("请输入除数");
			int num2=input.nextInt();
			 logger.debug("除数");
			System.out.println(num1+"+"+num2+"="+(num1+num2)); 
			 logger.debug("结果");
			 
    	
    	
	}
}
