package com.shaodq.chapter2.d20180727;

import java.util.Scanner;

public class testAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
        Administrator ad=new Administrator();
        System.out.println("�������û���:");
        ad.name=input.next();
        System.out.println("������������:");
        ad.password=input.next();
        
        ad.show();
        
       
        
        while (true) {
			System.out.println("������������:");
			String new_password=input.next();
			
			System.out.println("���ٴ�����������:");
			String re_password=input.next();
			
			if(new_password.equals(re_password)){
				ad.password=new_password;
				System.out.println("�����޸ĳɹ�.");
				ad.show();
				break;
			}else{
				System.out.println("������������벻һ�£����ٴ�����.");
			}
		}
	}

}
