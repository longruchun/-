package com.shaodq.chapter2.d20180712;

public class teachSample5 {

	public static void main(String[] args) {
		//for 循 环
		int total=0;
		for(int i=2;i<=100;i+=2){
			total+=i;
		}
		
		total=0;
		int i=2;
		while(i<=100){
			total+=i;
			i+=2;
		}
		
		System.out.println("结果是:"+total);
	}

}
