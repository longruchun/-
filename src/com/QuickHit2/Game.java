


package com.QuickHit2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Game {
   //����Ϸ�൱�У�
   //Ӧ��������ַ�������������ַ����ķ���---��������¼��Ҫ��������������ʵʩ�Աȣ��ַ������������ַ��������ʱ��Ļ
   //�ж����������ַ����Ƿ���ȷ�ķ���
   //����������ַ��Ƿ���ȷ���жϹ������Ӧ����
	
	//���һ��ȫ�ֱ�����¼�������ַ�����������������������У�������������ݽ��бȶ�
	String currentWord=null;
	
	//���һ����Ա����---�����Ķ��󣬱����Ǹ������������ο����Ϸ
	Player player;
	
	//���һ����������¼��ǰ����ǰ�����Ŀ�ʼʱ��
	long currentTimespam=0;
	
	
	//˳������һ���޲ι��췽��
	Game(){}
	
	//������ʵ����һ����Ϸ�࿪ʼ��Ϸ֮ǰ����Ҫ����Ӧ����Ҵ��� ����������������Ƿ���Game��Ĺ��� ���������
	Game(Player player){
		this.player=player;
	}
	
	
	
	/**
	 * ��������ַ���������ķ� ��
	 * @param  wordLen---Ҫ�������ַ����ĳ���
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
		//����:48-57
		//Сд��ĸ:97-122
		//��д��ĸ:65-90
		//random.nextInt(max)%(max-min+1) + min;
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
	
	//��ʼ��Ϸ����
	void playing() {
		//��ʼ��Ϸ
		Scanner input=new Scanner(System.in);
		while(true) {
			
				//ÿ�������������Ҫ��������
				//1  ���ݾݼ�������Ĺ涨�������Ӧ���ȵ��ַ���������ʾ���������ַ���
				//�ж�����ڸü����Ƿ�������˶�Ӧ���������
				if(!player.isPassLevel()) {
					if(player.getScore()==0) {//����ü���,�������Ϊ0��˵���ǵ�һ�ν���ü��𣬼�¼����ʱ��
						player.beginDate=System.currentTimeMillis();
					}
					//��������δͨ��
					//����������ַ���
					getWord(LevelHelper.levels[player.getLevelNo()-1].getStrLength());
					//�ȴ��������
					String playerStr=input.next();
					if(Juge(playerStr)) {
						//������ȷ
						//�����ȷ����Ҫ����Ļ�����������ȷ    ��ǰ����    ��ǰ����   ��ǰ��������ʱ��
						//������ҵ�����ʱ��ҪС��10��
						long currentTime=System.currentTimeMillis();;
						if((currentTime-currentTimespam)/1000>LevelHelper.levels[player.getLevelNo()-1].getLimitTime()) {
							//��ʱ����
							System.out.println("�Բ���������̫��.Game Over");
						}else {
							player.setScore(player.getScore()+LevelHelper.levels[player.getLevelNo()-1].getPerScore());
							//�����ȷ����Ҫ����Ļ�����������ȷ    ��ǰ����    ��ǰ����   ��ǰ��������ʱ��
							//������һ�����ַ����� ��������һ���ַ�����ƴ��
							StringBuffer sb=new StringBuffer("������ȷ ");
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
					//�������Ѿ�ͨ��
					//�ж��Ƿ�����߼���ͨ�أ����ǣ���ϲ��ң���Ϸ����
					//����:����Ҽ����������������㣬���¼�¼������Ŀ�ʼʱ��
					
					if(player.LevelNo==6) {
						System.out.println("��ϲ������ţ��ȫ������ͨ�����.");
						break;
					}else {
						player.LevelNo++;//��Ҽ�������
						player.setScore(0);
						player.setBeginDate(System.currentTimeMillis());
					}
		
				}
				
				
			
			
		}
		
		System.out.println("����ִ�н���");
	}
	
}
