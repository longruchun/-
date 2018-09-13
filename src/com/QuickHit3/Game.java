
package com.QuickHit3;

import java.io.PrintStream;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Game {
 
	String currentWord=null;
	
	
	Player player;
	
	
	long currentTimespam=0;


	private PrintStream sb;
	
	
	
	Game(){}
	
	Game(Player player){
		this.player=player;
	}
	
	
	
	void getWord(int wordLen) {
		String str="";
		for(int i=0;i<wordLen;i++) {
			str+=charFactory();
		}
		
		System.out.println(str);
		currentWord=str;
		currentTimespam=System.currentTimeMillis();
	}
	
	char charFactory() {
		char ch=' ';
		
		Random random = new Random();
		int val=random.nextInt(3)%(3-1+1)+1;
		
		int ascii=0;
		
		
		if(val==1) {//产生数字
			ascii=random.nextInt(57)%(57-48+1)+48;
		}else if(val==2) {//产生小写字母
			ascii=random.nextInt(122)%(122-97+1)+97;
		}else if(val==3) {//产生大写字母
			ascii=random.nextInt(90)%(90-65+1)+65;
		}
		
		
		
		return (char)ascii;
	}
	
    //判断玩家是否正确输入的方法
	boolean Juge(String word) {
		return word.equals(currentWord);
	}
	
	void playing() {
		//开始游戏
		Scanner input=new Scanner(System.in);
		while(true) {
			
				if(!player.isPassLevel()) {
					if(player.getScore()==0) {//进入该级别,如果积分为0，说明是第一次进入该级别，记录进入时间
						player.beginDate=System.currentTimeMillis();
					}
					getWord(LevelHelper.levels[player.getLevelNo()-1].getStrLength());
					String playerStr=input.next();
					if(Juge(playerStr)) {
						long currentTime=System.currentTimeMillis();;
						if((currentTime-currentTimespam)/1000>LevelHelper.levels[player.getLevelNo()-1].getLimitTime()) {
							//超时输入
							System.out.println("对不起，你输入太慢.Game Over");
						}else {
							player.setScore(player.getScore()+LevelHelper.levels[player.getLevelNo()-1].getPerScore());
							sb.append("当前级别:"+player.getLevelNo()+" ");
							sb.append("当前积分:"+player.getScore()+" ");
							
							long elipsetime=(System.currentTimeMillis()-player.getBeginDate())/1000;
							
							sb.append("当前级别已用时间:"+elipsetime);
							
							System.out.println(sb.toString());
							
						}
						
						
						
					}else {
						//输入错误
						break;
					}
					
					
				}else {
					if(player.LevelNo==6) {
						System.out.println("恭喜你,你过关了");
						break;
					}else {
						player.setScore(0);
						player.setBeginDate(System.currentTimeMillis());
					}
		
				}
				
				
			
			
		}
		
		System.out.println("程序结束");
	}
	
}
