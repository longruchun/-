package com.lrc20180910;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Seller s=new Seller();
		Regal  r=new   Regal("10086","凯悦");
	   Excelle e=new  Excelle("1008611","君威");
	   
	   System.out.println("请输入销售人员的姓名");
	   s.setName(input.next()); 
	   System.out.println("请输入销售了的数量");
	 
	   
	   
	   
	}
	 
	
	
	
}
