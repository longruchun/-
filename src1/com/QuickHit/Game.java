package com.QuickHit;

import java.util.Random;
import java.util.Scanner;

import com.QuickHit2.LevelHelper;

public class Game {

	String currentWord = null;

	Player player;
	long currentTimespam = 0;

	public Game(Player player) {
		super();
		this.player = player;
	}

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public char charfactory() {
		char ch = ' ';
		Random rd = new Random();
		int vaule = rd.nextInt(3) % (3 - 1 + 1) + 1;
		int ascil = 0;

		if (vaule == 1) {
			ascil = rd.nextInt(57) % (57 - 48 + 1) + 48;
		} else if (vaule == 2) {
			ascil = rd.nextInt(122) % (122 - 97 + 1) + 97;
		}
		if (vaule == 3) {
			ascil = rd.nextInt(90) % (90 - 65 + 1) + 65;
		}

		return (char) ascil;

	}

	public void getWord(int wordLen) {
		String str = "";
		for (int i = 0; i < wordLen; i++) {

			str += charfactory();
		}

		System.out.println(str);
		currentWord = str;
		currentTimespam = System.currentTimeMillis();

	}

	public boolean juge(String word) {

		return word.equals(currentWord);
	}

	public void playing() {

		Scanner input = new Scanner(System.in);

		while (true) {

			if (!player.isPassLevel()) {

				if (player.getScore() == 0) {

					player.beginDate = System.currentTimeMillis();

				}
				
				getWord(LevelHelper.levels[player.getLevelNo()-1].getStrLength());
                 String playerStr=input.next();
                  
                 if (juge(playerStr)) {
					
                	 long currentTime=System.currentTimeMillis();
                	 
                	 Object[] levels;
					if (( currentTime-currentTimespam)/1000>LevelParam.levels[player.getLevelNo()-1].getLimitTime()) {
						
						System.out.println("�������̫����,��������̭��");
					} else {
                        
						player.setScore(player.getScore()+LevelParam.levels[player.getLevelNo()-1].getPerScore());
						StringBuffer str=new StringBuffer("������ȷ");
						str.append("\t��ǰ������\t"+player.getLevelNo()+"��");
						str.append("\t��ǰ������\t"+player.getScore()+"��");
						
						
						long times=(System.currentTimeMillis()-player.getBeginDate())/1000;
						
						str.append("\t��ǰ����ʱ\t"+times+"s");
						
						
						System.out.println(str.toString());
						
					}
                	 
				} else {
                        break;//�������
				}
                  
                  
                  
                  
			} else {

				if (player.LevelNo == 6) {
					System.out.println("ͨ�سɹ�");
				} else {
					player.LevelNo++;// �������
					player.setScore(0);// ���·���
					player.setBeginDate(System.currentTimeMillis());
				}

			}
		}
          System.out.println("�������");
	}

}
