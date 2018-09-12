package com.lrc20180912_9;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("欧欧", "雪娜瑞");
		// 1、狗吃饭。
		dog.eat();
		// 2、狗玩接飞盘游戏。
		dog.catchingFlyDisc();
		Penguin pgn = new Penguin("楠楠", "Q妹");
		// 3、企鹅游泳。
		pgn.swim();
		// 4、输出企鹅信息。
		pgn.print();
	}
}
