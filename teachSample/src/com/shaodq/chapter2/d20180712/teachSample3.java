package com.shaodq.chapter2.d20180712;

import java.util.Scanner;

public class teachSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		int num=0;
		int zhenshu=0;
		int fushu=0;
		
		
		do{
    	  System.out.println("������һ����������:");
    	  num=input.nextInt();
    	  if(num>0){
    		  zhenshu++;
    	  }else if(num<0){
    		  fushu++;
    	  }
        }while(num!=0);
		
		System.out.println("������:"+zhenshu+"��,����"+fushu+"��");
	}

}
