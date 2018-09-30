package com.shaodq.chapter1.d20180707;

import java.util.Random;

public class Logic {

	public static void main(String[] args) {
		Random rd=new Random();
		
		
		int n1=rd.nextInt(10);
		int n2=rd.nextInt(10);
		
		System.out.println(n1&n2);//0
		System.out.println(n1|n2);//13
		System.out.println(n1^n2);//13
		
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));
	}

}
