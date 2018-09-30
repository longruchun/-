package com.shaodq.chapter2.d20180724;

import java.util.Random;
import java.util.Scanner;

public class demension2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String[][] registerInfo={{"张三","123456","0285"},{"李明","789654","2554"},{"王五","0000","9999"}};
        
        for(int i=0;i<registerInfo.length;i++){
        	//System.out.println(registerInfo[i]);
        	System.out.println("第"+(i+1)+"个用户的注册信息:");
        	for(int j=0;j<registerInfo[i].length;j++){
        		System.out.print(registerInfo[i][j]+"\t");
        	}
        	System.out.println();
        }*/
		Scanner input=new Scanner(System.in);
		//声明但不赋值，赋值等用户注册时， 动态进行
		String[][] users=new String[5][3];
		boolean isLogin=false;//记录用户是否登录成功
		
		while (true) {
			System.out.println("*************大富翁有奖购物系统****************");
			System.out.println("1.  用户注册");
			System.out.println("2.  查看系统注册用户");
			System.out.println("3.  用户登录");
			System.out.println("0.  退出系统");
			System.out.println("*****************************************");
			System.out.println("请选择:(选择对应数字)");
			
			int choice=-1;
			
			if(input.hasNextInt()){
				choice = input.nextInt();
			}else{
				System.out.println("输入出错.");
				input=new Scanner(System.in);
				continue;
			}
			
			
			switch (choice) {
				case 0:
					break;
				case 1:
					System.out.println("您选择了用户注册.");
	
					String[] reginfo = new String[3];
					System.out.println("请输入您的用户昵称:");
					reginfo[0] = input.next();
					System.out.println("请输入您的密码:");
					reginfo[1] = input.next();
					//准备随机产生卡号
					Random rd = new Random();
					int card = rd.nextInt(9000) + 1000;
					reginfo[2] = Integer.toString(card);
	
					//找到users 数组，合适的空位置，将reginfo放进去
					//如果位置已满，则提示用户，无法再注册新用户
					int index = -1;
					for (int i = 0; i < users.length; i++) {
						if (users[i][0] == null) {
							index = i;
							break;
						}
					}
	
					if (index != -1) {
						users[index] = reginfo;
					} else {
						System.out.println("位置已满，无法再注册新用户");
					}
	
					continue;
				case 2:
					System.out.println("姓名\t密码\t卡号");
					
					for (int i = 0; i < users.length; i++) {
						if (users[i][0] == null) {
							break;
						}
	
						for (int j = 0; j < users[i].length; j++) {
							System.out.print(users[i][j] + "\t");
						}
	
						System.out.println();
					}
					continue;
				case 3://登录
					if(isLogin){
						System.out.println("你之前已成功登录系统，请不要重复登录");
					}else{
						//登录逻辑开始
						//限定用户只能尝试3次，之后，锁定系统
						//有此登录次数控制需求，我们需要设计变量，记录已尝试次数
						int _try=3;//尝试次数
						while(!isLogin){
							if(_try==0){
								System.out.println("您已尝试3次失败，系统将暂时锁定.联系系统管理员。");
								break;
							}else{
								System.out.println("请输入您的用户昵称:");
								String name = input.next();
								System.out.println("请输入您的密码:");
								String pass = input.next();
								
								//循环遍历"注册数组",去找对应用户名及密码
								for(int i=0;i<users.length;i++){
									if(users[i][0]==null){
										break;
									}
									
									if(users[i][0].equals(name)&&users[i][1].equals(pass)){
										isLogin=true;
										break;
									}
									
								}
								
								if(isLogin){
									System.out.println("登录成功，欢迎进入系统");
								}else{
									_try--;
									System.out.println("用户名或密码错。");
								}
								
								
							}
						}
						
						
						
						
					}
					continue;
				default:
					System.out.println("输入出错.");
			}
			
			break;
		}
		
		System.out.println("购物体验结束，退出系统.欢迎下次光临!");
	}

}
