package com.shaodq.chapter2.d20180712;

import java.util.Scanner;

public class teachSample8 {

	public static void main(String[] args) {
		
    	  //淡、旺季    头等舱、经济舱     5000 9854
		  double base_money=5000;
		  double discount1=0.9;
		  double discount2=0.8;
		  double discount3=0.5;
		  double discount4=0.4;
		  
		  Scanner input=new Scanner(System.in);
		  System.out.println("请输入购票月份");
		  int month=input.nextInt();
		  System.out.println("请选择头等舱或经济舱(0-1)");
		  int level=input.nextInt();
		  
		  switch(month){
			  case 4:
			  case 5:
			  case 6:
			  case 7:
			  case 8:
			  case 9:
			  case 10:
				  switch(level){
					  case 0:
						  System.out.println("机票价格:"+base_money*discount1);
						  break;
					  case 1:
						  System.out.println("机票价格:"+base_money*discount2);
						  break;
				  default:
					  System.out.println("输入出错");
				  }
			      break;
			  case 1:
			  case 2:
			  case 3:
			  case 11:
			  case 12:
				  switch(level){
					  case 0:
						  System.out.println("机票价格:"+base_money*discount3);
						  break;
					  case 1:
						  System.out.println("机票价格:"+base_money*discount4);
						  break;
					  default:
						  System.out.println("输入出错");
				      break;
				  }
			  default:
				  System.out.println("输入出错");
		  
		  }
		  
		  
		
		   
		
	}

}
