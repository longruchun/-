package com.shaodq.chapter1.d20180706;

public class teachSample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //java 就是将现实世界的问题模型， 我们编写为java程 序（软件世界的模型 ）来模拟和解决问题
		//自顶向下，逐步求精 
		//分而治之，各个击破
		//现实模型的解决方案
		//1  左手一张牌  右手一张牌
		//2 借助某个工具或容器，暂时放一下左手的牌，让左手空出来
		//3 将右手的牌交给左手
		//4 将暂时放在工具中的原先左手中的牌交给右手
		//将现实的实现步骤，用java 代码模拟出来
		
		//1  左手一张牌  右手一张牌
		//我们以声明两个变量的方式，模拟实现了第一句
		int leftHandCard=8;
		int rightHandCard=10;
		//1.1 交换前，打印出左、右手牌
		System.out.println("交换前:"+"左手:"+leftHandCard+"\t右手:"+rightHandCard);
		
		
		//2 借助某个工具或容器，暂时放一下左手的牌，让左手空出来
		//在代码实现上， 我们声明一个中间量，用来暂时存放左手牌
		int temp=leftHandCard;
		
		//3 将右手的牌交给左手
		leftHandCard=rightHandCard;
		
		//4 将暂时放在工具中的原先左手中的牌交给右手
		rightHandCard=temp;
		//4.1 交换后结果
		System.out.println("交换后:"+"左手:"+leftHandCard+"\t右手:"+rightHandCard);
		
		
		//以上代码已能正确完成交换过程 ， 可是我们作为代码，要能明示交换结果，所以我们在以上代码基础上
		//做出一些代码的增补，明示交换结果
		
		
		
	}

}
