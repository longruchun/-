package com.shaodq.chapter2.d20180730.menutest;

import java.util.Scanner;

public class menu {
   
   boolean loginStatus;//标识是否登录过	因为它是一个成员变量，有默认值为假
   String[][] userInfos={{"zs","123"},{"ls","456"},{"ww","789"}};//用户名、密码数组
   
   public void login(){
	   if (!loginStatus) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("请输入用户名称 :");
			String name = input.next();
			System.out.print("请输入用户密码 :");
			String pass = input.next();
			for (int i = 0; i < userInfos.length; i++) {
				if (name.equals(userInfos[i][0]) && pass.equals(userInfos[i][1])) {
					loginStatus = true;//登录状态标识设置为真，表明用户是成功登录了的，除非应用结束，该登录成功标识将
					                   //一直保持为真，表明用户无须重复登录
					System.out.println("登录成功，欢迎进入系统.");
					break;
				}
			} 
			
			if(!loginStatus){
				System.out.println("登录失败，你无权进入系统");
			}
	   }
	   
   } 
   
	
   public void topmenu(){
	   System.out.println("\t欢迎使用我行我素购物管理系统");
	   System.out.println("\t\t1. 登录系统");
	   System.out.println("\t\t2. 退出");
	   System.out.println("\t....................");
   }
   
   public void mainmenu(){
	   System.out.println("\t欢迎使用我行我素购物管理系统主菜单");
	   System.out.println("\t....................");
	   System.out.println("\t\t1. 客户信息管理");
	   System.out.println("\t\t2. 真情回馈");
	   System.out.println("\t....................");
   }
   
   public void level2menu(){
	   System.out.println("\t欢迎使用我行我素购物管理系统 > 真情回馈");
	   System.out.println("\t....................");
	   System.out.println("\t\t1. 幸运大放送");
	   System.out.println("\t\t2. 幸运抽奖");
	   System.out.println("\t....................");
   }
   
   public void tips(){
	   System.out.println("请选择：");
   }
   
   
}
