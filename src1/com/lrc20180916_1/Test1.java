package com.lrc20180916_1;



import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test1 {
	
	
	public static Logger logger=Logger.getLogger(Test1.class.getName());
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
		System.out.println("�����뱻����");
		int num1=input.nextInt();
		 logger.debug("����������"+num1);
		 System.out.println("���������");
			int num2=input.nextInt();
			 logger.debug("����"+num2);
			System.out.println(num1+"+"+num2+"="+(num1+num2)); 
			 logger.debug("���"+(num1+num2));
			 
    	
    	
	}
}
