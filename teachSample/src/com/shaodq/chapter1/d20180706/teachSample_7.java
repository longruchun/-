package com.shaodq.chapter1.d20180706;

import java.util.Scanner;

public class teachSample_7 {

	public static void main(String[] args) {
		 int num=4586;
		 
		 System.out.println(num+"/1000="+(num/1000));
		 System.out.println(num+"%1000="+(num%1000));
		 num=num%1000;
		 System.out.println();
		 
		 System.out.println(num+"/100="+(num/100));
		 System.out.println(num+"%100="+(num%100));
		 num=num%100;
		 System.out.println();
		 
		 System.out.println(num+"/10="+(num/10));
		 System.out.println(num+"%10="+(num%10));
		 num=num%10;
		 System.out.println();


	}

}
