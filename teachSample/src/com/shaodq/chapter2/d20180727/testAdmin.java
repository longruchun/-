package com.shaodq.chapter2.d20180727;

import java.util.Scanner;

public class testAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
        Administrator ad=new Administrator();
        System.out.println("请输入用户名:");
        ad.name=input.next();
        System.out.println("请输入新密码:");
        ad.password=input.next();
        
        ad.show();
        
       
        
        while (true) {
			System.out.println("请输入新密码:");
			String new_password=input.next();
			
			System.out.println("请再次输入新密码:");
			String re_password=input.next();
			
			if(new_password.equals(re_password)){
				ad.password=new_password;
				System.out.println("密码修改成功.");
				ad.show();
				break;
			}else{
				System.out.println("两次输入的密码不一致，请再次输入.");
			}
		}
	}

}
