package com.shaodq.chapter1.d20180707;

import java.util.Random;

public class teachSample_2 {

	public static void main(String[] args) {
	/*	int num=117;
		
		int num1=(num>>3);
		
		System.out.println("num1="+num1);
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(num1));
		int num2=binaryToInt(Integer.toBinaryString(num1));
		System.out.println(num2);
		
		System.out.println(8<<1);*/
		
		
		int n1=8;
		int n2=10;
		
		int tmp=n1;
		n1=(n1^n2)^n1;
		n2=(n2^tmp)^n2;
		
		System.out.println(n1);
		System.out.println(n2);
		
		//(n1&&n2)=((n2++)==12);----运算符优先序案例 ，强烈建 议使用小括号明确计算步骤，
		//代码可读性高，清晰
		
	}
	
	
	public static int binaryToInt(String binary) {
        if (binary == null) {
           System. out.println("can't input null ！" );
       }
        if (binary.isEmpty()) {
           System. out.println("you input is Empty !" );
       }
        int max = binary.length();
       String new_binary = "";
        if (max >= 2 && binary.startsWith("0")) {
            int position = 0;
            for (int i = 0; i < binary.length(); i++) {
                 char a = binary.charAt(i);
                 if (a != '0' ) {
                     position = i;
                      break;
                }
           }
            if (position == 0) {
                new_binary = binary.substring(max - 1, max);
           } else {
                new_binary = binary.substring(position, max);
           }
       } else {
           new_binary = binary;
       }
        int new_width = new_binary.length();

        long result = 0;
        if (new_width < 32) {
            for (int i = new_width; i > 0; i--) {
                 char c = new_binary.charAt(i - 1);
                 int algorism = c - '0' ;
                result += Math. pow(2, new_width - i) * algorism;
           }
       } else if (new_width == 32) {
            for (int i = new_width; i > 1; i--) {
                 char c = new_binary.charAt(i - 1);
                 int algorism = c - '0' ;
                result += Math. pow(2, new_width - i) * algorism;
           }
           result += -2147483648;
       }
        int a = new Long(result).intValue();
        return a;
  }


}
