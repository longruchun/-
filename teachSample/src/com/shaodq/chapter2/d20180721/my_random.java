package com.shaodq.chapter2.d20180721;

import java.util.Random;

public class my_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //首先定义一个随机数产生器
		Random rd=new Random();
		
		System.out.println(rd.nextInt(1000));
	}

}
