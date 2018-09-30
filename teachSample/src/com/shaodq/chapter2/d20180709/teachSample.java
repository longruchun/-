package com.shaodq.chapter2.d20180709;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 下班回家，时间兖分， 走路；不够，乘车
		// 设置分支条件
		// 1 第一种方式：设计一个布尔变量的方式
		boolean isEnough = true;

		if (isEnough) {
			System.out.println("以散步的方式慢慢走回去");
		} else {
			System.out.println("乘车回家省点时间");
		}

		// 2 第二种方式：条件的括号中，给出的是一个计算结果为布尔类型的表达式
		// 我的时间是否充分，要依据以下情况：1）我完成课堂作业的时间 2）体育课完成5圈奔跑的时间
		int homeWorkTime = 10;
		int runTime = 8;

		if (homeWorkTime <= 10 && runTime <= 10) {
			System.out.println("以散步的方式慢慢走回去");
		} else {
			System.out.println("乘车回家省点时间");
		}

	}

}
