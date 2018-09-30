package com.shaodq.chapter2.d20180712;

import java.util.Scanner;

public class teachSample9 {

	public static void main(String[] args) {
		
    	  Scanner input=new Scanner(System.in);
    	  
    	  int over=1;
    	  int Max=0;
    	  int Min=0;
    	  int star=1;
    	  do{
    		  System.out.println("请入数据:");
    		  int i=input.nextInt();
    		  if(star==1){
    			  Max=1;
    			  Min=1;
    		  }else{
    			  if(i>Max){
    				  Max=i;
    			  }
    			  if(i<Min){
    				  Min=i;
    			  }
    		  }
    		  
    		  
    		  
    		  System.out.println("要继续吗?输入0结束.1继续");
    		  over=input.nextInt();
    	  }while(over!=0);
		   
		   System.out.println("最大值:"+Max+"\t最小值:"+Min);
	}

}
