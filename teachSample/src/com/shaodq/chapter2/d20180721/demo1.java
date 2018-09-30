package com.shaodq.chapter2.d20180721;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int i=100;
        
        int distance=50;
        
        //简单条件结构
        if(i>=100){
        	System.out.println("i是大于或等于100的");
        }
        
        //简单条件结构
        if(condition){
        	
        }else{
        	
        }
        
        double money=4.5;
        if(money>=3&&distance<=50){
        	System.out.println("我可以到德克士买个蛋卷冰淇淋");
        }else{
        	System.out.println("在路边小店买根冰棍");
        }*/
		
		int i=100;
		int j=110;
		
		int num=10;
		
		if(i>=j || ++num>=11){
			System.out.println("代码运行进入了这个分支");
		}
		
		//if((num++)+5>=11)
		
		System.out.println("num="+num);
	}

}
