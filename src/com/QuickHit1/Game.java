package com.QuickHit1;

import java.util.Random;

public class Game {
	private Player player;// 玩家
		

	public Game(Player player) {
		this.player = player;
	}
	
	public String printStr() {
		int strLength = LevelParam.levels[player.getLevelNo() - 1].getStrLength();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		// 通过循环生成要输出的字符串
		for (int i = 0; i < strLength; i++) {
			// 产生随机数
			int rand = random.nextInt(strLength);
			// 根据随机数拼接字符串
			switch (rand) {
			case 0:
				buffer.append(">");
				break;
			case 1:
				buffer.append("<");
				break;
			case 2:
				buffer.append("*");
				break;
			case 3:
				buffer.append("&");
				break;
			case 4:
				buffer.append("%");
				break;
			case 5:
				buffer.append("#");
				break;
			}
		}
		// 输出字符串
		System.out.println(buffer);
		// 返回字符串用于和玩家输入相比较
		return buffer.toString();
	}
	public void printResult(String out, String in) {
		boolean flag;
		if (out.equals(in)) {
			flag=true;
		} else {
			flag=false;
		}
		//  如果输入正确
		if (flag) {
			long currentTime = System.currentTimeMillis();
			//  如果超时
			if ((currentTime - player.getStartTime()) / 1000 
					>LevelParam.levels[player.getLevelNo() - 1].getTimeLimit()) {
				System.out.println("你输入太慢了，已经超时，退出！");
				System.exit(1);
				//  如果没有超时
			} else {				
				// 计算当前积分
				player.setCurScore(player.getCurScore()
						+ LevelParam.levels[player.getLevelNo() - 1].getPerScore());
				// 计算已用时间
				player.setElapsedTime((int) ((currentTime - player
						.getStartTime()) / 1000));
				// 输出当前积分、当前级别、已用时间
				System.out.println("输入正确，您的级别"+ player.getLevelNo()+" ,您的积分" + player.getCurScore() + ",已用时间"	+ player.getElapsedTime() + "秒。");
				// 判断用户是否已经闯过最后一关
				if (player.getLevelNo() == 6) {
					int score=LevelParam.levels[player.getLevelNo() - 1].getPerScore() 
							* LevelParam.levels[player.getLevelNo() - 1].getStrTime();//计算闯关分数
					if (player.getCurScore() == score) {
						System.out.println("你已闯关成功");
						System.exit(0);
					}
				}
			}
			// 如果输入错误
		} else {
			System.out.println("输入错误，退出！");
			System.exit(1);
		}
	}
}
