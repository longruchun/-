
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
		
		
		if(val==1) {//��������
			ascii=random.nextInt(57)%(57-48+1)+48;
		}else if(val==2) {//����Сд��ĸ
			ascii=random.nextInt(122)%(122-97+1)+97;
		}else if(val==3) {//������д��ĸ
			ascii=random.nextInt(90)%(90-65+1)+65;
		}
		
		
		
		return (char)ascii;
	}
	
    //�ж�����Ƿ���ȷ����ķ���
	boolean Juge(String word) {
		return word.equals(currentWord);
	}
	
	void playing() {
		//��ʼ��Ϸ
		Scanner input=new Scanner(System.in);
		while(true) {
			
				if(!player.isPassLevel()) {
					if(player.getScore()==0) {//����ü���,�������Ϊ0��˵���ǵ�һ�ν���ü��𣬼�¼����ʱ��
						player.beginDate=System.currentTimeMillis();
					}
					getWord(LevelHelper.levels[player.getLevelNo()-1].getStrLength());
					String playerStr=input.next();
					if(Juge(playerStr)) {
						long currentTime=System.currentTimeMillis();;
						if((currentTime-currentTimespam)/1000>LevelHelper.levels[player.getLevelNo()-1].getLimitTime()) {
							//��ʱ����
							System.out.println("�Բ���������̫��.Game Over");
						}else {
							player.setScore(player.getScore()+LevelHelper.levels[player.getLevelNo()-1].getPerScore());
							sb.append("��ǰ����:"+player.getLevelNo()+" ");
							sb.append("��ǰ����:"+player.getScore()+" ");
							
							long elipsetime=(System.currentTimeMillis()-player.getBeginDate())/1000;
							
							sb.append("��ǰ��������ʱ��:"+elipsetime);
							
							System.out.println(sb.toString());
							
						}
						
						
						
					}else {
						//�������
						break;
					}
					
					
				}else {
					if(player.LevelNo==6) {
						System.out.println("��ϲ��,�������");
						break;
					}else {
						player.setScore(0);
						player.setBeginDate(System.currentTimeMillis());
					}
		
				}
				
				
			
			
		}
		
		System.out.println("�������");
	}
	
}
