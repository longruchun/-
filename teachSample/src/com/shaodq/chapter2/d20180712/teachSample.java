package com.shaodq.chapter2.d20180712;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //华信现在每年向社会输送1.5万编码人才，并且以每年2.5%的速率增长
		//问：经过多少年，华信每年能向社会输送10万人才
		
		//分析：循环次数不能预先确定， 我们更适合采用while循环语法
		//当算法轴路确定后， 我们先声明代码中要用到的变量，并赋初值
		double persons=1.5;
		double rate=0.125;
		
		int years=0;
		
		//while循 环
		while(persons<10){
			persons*=(1+rate);
			years++;
		}
		
		System.out.println("经过"+years+"年,输送人才达到"+persons+"万");
	}

}
