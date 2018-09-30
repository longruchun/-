


package com.QuickHit2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Game {
   //在游戏类当中：
   //应该有输出字符串（随机产生字符）的方法---产生并记录（要和玩家输入进来的实施对比）字符串，并将该字符串输出到时屏幕
   //判断玩家输入的字符串是否正确的方法
   //对玩家输入字符是否正确的判断过后的相应处理
	
	//设计一个全局变量记录产生的字符串，待会儿好在其它方法中，跟玩家输入数据进行比对
	String currentWord=null;
	
	//设计一个成员属性---玩家类的对象，表明是该玩家启动的这次快打游戏
	Player player;
	
	//设计一个变量，记录当前级别当前次数的开始时间
	long currentTimespam=0;
	
	
	//顺带声明一个无参构造方法
	Game(){}
	
	//我们在实例化一个游戏类开始游戏之前，就要将对应的玩家传递 进来，这个动作我们放在Game类的构造 方法中完成
	Game(Player player){
		this.player=player;
	}
	
	
	
	/**
	 * 随机产生字符串并输出的方 法
	 * @param  wordLen---要产生的字符串的长度
	 * @return
	 */
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
		//数字:48-57
		//小写字母:97-122
		//大写字母:65-90
		//random.nextInt(max)%(max-min+1) + min;
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
	
	//开始游戏方法
	void playing() {
		//开始游戏
		Scanner input=new Scanner(System.in);
		while(true) {
			
				//每个级别里边我们要做的事情
				//1  根据据级别数组的规定：输出相应长度的字符串，并提示玩家输入该字符串
				//判断玩家在该级别是否已完成了对应的输入次数
				if(!player.isPassLevel()) {
					if(player.getScore()==0) {//进入该级别,如果积分为0，说明是第一次进入该级别，记录进入时间
						player.beginDate=System.currentTimeMillis();
					}
					//本级别尚未通关
					//产生并输出字符串
					getWord(LevelHelper.levels[player.getLevelNo()-1].getStrLength());
					//等待玩家输入
					String playerStr=input.next();
					if(Juge(playerStr)) {
						//输入正确
						//如果正确，则要在屏幕输出：输入正确    当前级别    当前积分   当前级别已用时间
						//计算玩家的输入时间要小于10秒
						long currentTime=System.currentTimeMillis();;
						if((currentTime-currentTimespam)/1000>LevelHelper.levels[player.getLevelNo()-1].getLimitTime()) {
							//超时输入
							System.out.println("对不起，你输入太慢.Game Over");
						}else {
							player.setScore(player.getScore()+LevelHelper.levels[player.getLevelNo()-1].getPerScore());
							//如果正确，则要在屏幕输出：输入正确    当前级别    当前积分   当前级别已用时间
							//由于是一个长字符串， 我们声明一个字符串来拼接
							StringBuffer sb=new StringBuffer("输入正确 ");
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
					//本级别已经通关
					//判断是否是最高级别通关，若是：则恭喜玩家，游戏结束
					//若否:则：玩家级别升级，积分清零，重新记录本级别的开始时间
					
					if(player.LevelNo==6) {
						System.out.println("恭喜，你真牛！全部级别通关完成.");
						break;
					}else {
						player.LevelNo++;//玩家级别升级
						player.setScore(0);
						player.setBeginDate(System.currentTimeMillis());
					}
		
				}
				
				
			
			
		}
		
		System.out.println("程序执行结束");
	}
	
}
