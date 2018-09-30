package com.shaodq.chapter2.d20180730.menutest;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        menu menu1=new menu();
        Scanner input=new Scanner(System.in);
        
        //设计一个变量，记录当前菜单处于哪一级
        int level=0;
        int choice=-1;
        
        while(true){
        	switch(level){
	        	case 0:
	        		menu1.topmenu();
	        		
	        		//提示用户选择菜单项 
	        		menu1.tips();
	        		choice=input.nextInt();
	        		
	        		switch(choice){
		        		case 1:
		        			menu1.login();
		        			if(menu1.loginStatus){
			        			level=1;
			        			choice=-1;
		        			}else{
		        				level=0;
			        			choice=-1;
		        			}
		        			continue;
		        		case 2:
		        			System.out.println("您选择了退出系统，欢迎下次光临.");
		        			break;//跳出内层switch
		        		default:
		        			System.out.println("输入出错.");
		        			continue;
	        		}
	        		
	        		
	        		break;//跳出外层switch
	        	case 1:
	        		menu1.mainmenu();
	        		
	        		//提示用户选择菜单项
	        		menu1.tips();
                    choice=input.nextInt();
	        		
	        		switch(choice){
	        		    case 0:
	        		    	level=0;
		        			choice=-1;
		        			continue;
		        		case 1:
		        			level=1;
		        			choice=-1;
		        			System.out.println("\"客户信息管理功能正在开发完善中......\"");
		        			continue;
		        		case 2:
		        			level=2;
		        			choice=-1;
		        			continue;//跳出内层switch
		        		default:
		        			System.out.println("输入出错.");
		        			level=1;
		        			choice=-1;
		        			continue;
	        		}
	        		
	        	case 2:
	        		menu1.level2menu();
	        		
	        		//提示用户选择菜单项 
	        		menu1.tips();
                    choice=input.nextInt();
	        		
	        		switch(choice){
	        		    case 0:
	        		    	level=1;
		        			choice=-1;
		        			continue;
		        		case 1:
		        			
		        			System.out.println("您选择了\"幸运大放送......\"");
		        			continue;
		        		case 2:
		        			System.out.println("您选择了\"幸运抽奖......\"");
		        			continue;//跳出内层switch
		        		default:
		        			System.out.println("输入出错.");
		        			choice=-1;
		        			continue;
	        		}
	        	    
        	}
        	
        	break;//跳出死循环 
        }
        
        
        System.out.println("购物结束(菜单循 环结束).");
	}

}
