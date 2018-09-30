package com.shaodq.chapter2.d20180711;

import java.util.Scanner;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1) 一个班级30名同学考java,老师让小明统计一下全班同学的平均分
		//2) 小明一向java学得很好，可此次考试，十分不理想，老师一气之下，让小明抄写java代码50遍
		
		/*System.out.println("抄写java代码");
		System.out.println("抄写java代码");
		System.out.println("抄写java代码");*/
		//.
		//.
		//.
		//System.out.println("抄写java代码");
		
		//其实， 老师就是想看小明能否活学活用，用循 环来解决这个问题
		//因为小明不断重复的抄写动作，是来断重复执行的同样的动作
		//这种场景下， 就适用循环结构来解决.
		//循 环有三种常用语法格式，我们先讲第一种:for
		
		//for 之后的小括号当中， 有三个表达式，用以控制循 环的特性
		//第一表达式：定义循 环变量---主要用以记录和控制循环执行了的次数
		//第二表达式：循 环终止条件---用以控制循 环的终止
		//第三表达式：更改循 环变量的值
		/*for(int i=0;i<50;i++){
			System.out.println("抄写java代码");
		}*/
		
		/*int result = 0;
		for (int i = 1; i <= 100; i++) {
			result += i;
		}
		System.out.println("result=" + result);*/
		
		/*for(int i=1;i<=150;i++){
			System.out.print(i+"\t");
			if(i%3==0){
				System.out.print("foo\t");
			}
			if(i%5==0){
				System.out.print("biz\t");
			}
			if(i%7==0){
				System.out.print("baz\t");
			}
			System.out.println();
			
		}*/
		
		//从键 盘任意输入三个数,求这三个数的最小公倍数
		/*Scanner scan=new Scanner(System.in);
		
		System.out.println("任意输入三个数:");
        System.out.println("第一个数:");
        int one=scan.nextInt();
        System.out.println("第二个数:");
        int tow=scan.nextInt();
        System.out.println("第三个数:");
        int thr=scan.nextInt();
        
        for(int i=1;;i++){
        	if(i%one==0&&i%tow==0&&i%thr==0){
        		System.out.println(one+" "+tow+" "+thr+" 的最小公倍数是:"+i);
        		break;
        	}
        }*/
		
		//逗号表达式
		/*for(int i=0,j=9;i<10;i++,j--){
			System.out.println(i+" "+j);
		}*/
		
		//1-100间，7以及7的倍数的数有几个，及其总和
		int i=7,j=1,Sum=0;
		for(;;){
			System.out.println(i);
			Sum+=i;
			i+=7;
			j++;
			if(i>=100){
				break;
			}
		}
		
		System.out.println("符合条件的数有:"+j+"个,总和是:"+Sum);
		
		
		
	}

}
