package com.shaodq.chapter2.d20180712;



public class teachSample10 {

	public static void main(String[] args) {
		double line=100;
		double speed=10;
		double rate=0.1;
		
		double change_long=0;
		double totle=0;
		
		int count=0;//统计要多少秒
		//计算：需要经过多少秒，绳子每秒增长达到10及以上
		while(true){
			count++;
			change_long=line*rate;
			if(change_long>=10){
				break;
			}
			line*=1.01;
		}
		
		totle=count*10;
		
		if(totle>line){
			System.out.println("可以爬出");
		}else{
			System.out.println("出不去");
		}
		
		
    	  
    	  
	}

}
