package com.shaodq.chapter1.d20180706;

import java.util.Scanner;

public class teachSample_6 {

	public static void main(String[] args) {
		 //演示三元运算符功能
		 /*String s1=(3>4?"3是大于4 的":"3 是小于4 的");
		  
		  System.out.println(s1);*/
		//演示自增、自减运算符功能
		//++i   =>  i=i+1 这样的操作  但是由于自增运算符可以前置，也可以后置
		//所以导致运算结果的一些特殊场景
		int num=10;
		System.out.println(num--);//自增符后置 ---先用变量值，再做自增
		System.out.println(--num);//自增符前置 ---先做自增，再用变量值，
		
		System.out.println('*' + '\t' +'*');
		System.out.println("*" + '\t' +'*');
		
		System.out.println(3.5%-2.1);
		
		System.out.println(3500/1000*1000==3500*1000/1000);
		System.out.println("5+5="+5+5); 
		
		//连续赋值
		int i,j,k;
		i=j=k=10;
		
		System.out.println("i="+i+"\t"+"j="+j+"\t"+"k="+k+"\t");
		
		//+=  *=   /=   -=    %=   >>>=    <<<=
		
		int number1=100;
		number1+=100;//number1=number1+100
		
		number1>>>=8;
		System.out.println("number1="+number1);
		
		boolean b1 = false;
        //区分好==和=的区别。
        if(b1==true){
		   System.out.println("结果为真");
        }else{
    	   System.out.println("结果为假");
        }
        
        
        int I = 1;
        I *= 1.1;
        System.out.println(I);//0
        I++;
        System.out.println(I);//1



	}

}
