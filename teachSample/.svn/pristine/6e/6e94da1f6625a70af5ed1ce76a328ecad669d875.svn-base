package com.shaodq.chapter2.d20180710;

import java.util.Scanner;

public class teachSample2 {

	public static void main(String[] args) {
		//我们要给学员讲解switch 的应用语法
		//此处我们结合一个实际场 景来讲解---一个商场管理系统的主菜单
		//1 在屏幕上印制菜单
		Scanner input=new Scanner(System.in);
		
		System.out.println("*************************");
		System.out.println("*\t1 登录系统");
		System.out.println("*\t2 选择商品");
		System.out.println("*\t3 友情回馈");
		System.out.println("*\t4 抽         奖");
		System.out.println("*\t5 退         出");
		System.out.println("*************************");
		System.out.println("请选择(1-5)：");
        int choice=input.nextInt();
        
        //分析一下以下这个多重if---else结构，它具备以下特点:
        //1  对整型数据进行判断
        //2  做的是判等判断
        //结论:具备以上特点的多重if---else，我们可以用结构更为紧凑的switch结构来替代
        
        /*if(choice==1){
        	System.out.println("您点选了\"登录系统\"");
        }else if(choice==2){
        	System.out.println("您点选了\"选择商品\"");
        }else if(choice==3){
        	System.out.println("您点选了\"友情回馈\"");
        } else if(choice==4){
        	System.out.println("您点选了\"抽         奖\"");
        } else if(choice==5){
        	System.out.println("您点选了\"退         出\"");
        } else{
        	System.out.println("选择出错");
        }*/
        
        //特点：根据条件判断，进入某个分支后，执行其中代码，但与多重if---else所不同的是:
        //代码执行完后， 它并不从整 个switch 结构中退出，而是不再加新个判断的进入了后续的分支
        //所以， 我们需要一种技术，让它执行完一个分支后，退出整个switch结构---break关键 字
        //我们用break关键字， 让它退出整 个switch结构，不再执行后续分支
        switch(choice){
           case 1:
        	   System.out.println("您点选了\"登录系统\"");
        	   break;
           case 2:
        	   System.out.println("您点选了\"选择商品\"");
        	   break;
           case 3:
        	   System.out.println("您点选了\"友情回馈\"");
        	   break;
           case 4:
        	   System.out.println("您点选了\"抽         奖\"");
        	   break;
           case 5:
        	   System.out.println("您点选了\"退         出\"");
        	   break;
           default:
        	   System.out.println("选择出错");
        	   
        }
       
	}

}
