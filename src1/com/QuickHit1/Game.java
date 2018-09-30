package com.QuickHit1;

import java.util.Random;

public class Game {
	private Player player;// ���
		

	public Game(Player player) {
		this.player = player;
	}
	
	public String printStr() {
		int strLength = LevelParam.levels[player.getLevelNo() - 1].getStrLength();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		// ͨ��ѭ������Ҫ������ַ���
		for (int i = 0; i < strLength; i++) {
			// ���������
			int rand = random.nextInt(strLength);
			// ���������ƴ���ַ���
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
		// ����ַ���
		System.out.println(buffer);
		// �����ַ������ں����������Ƚ�
		return buffer.toString();
	}
	public void printResult(String out, String in) {
		boolean flag;
		if (out.equals(in)) {
			flag=true;
		} else {
			flag=false;
		}
		//  ���������ȷ
		if (flag) {
			long currentTime = System.currentTimeMillis();
			//  �����ʱ
			if ((currentTime - player.getStartTime()) / 1000 
					>LevelParam.levels[player.getLevelNo() - 1].getTimeLimit()) {
				System.out.println("������̫���ˣ��Ѿ���ʱ���˳���");
				System.exit(1);
				//  ���û�г�ʱ
			} else {				
				// ���㵱ǰ����
				player.setCurScore(player.getCurScore()
						+ LevelParam.levels[player.getLevelNo() - 1].getPerScore());
				// ��������ʱ��
				player.setElapsedTime((int) ((currentTime - player
						.getStartTime()) / 1000));
				// �����ǰ���֡���ǰ��������ʱ��
				System.out.println("������ȷ�����ļ���"+ player.getLevelNo()+" ,���Ļ���" + player.getCurScore() + ",����ʱ��"	+ player.getElapsedTime() + "�롣");
				// �ж��û��Ƿ��Ѿ��������һ��
				if (player.getLevelNo() == 6) {
					int score=LevelParam.levels[player.getLevelNo() - 1].getPerScore() 
							* LevelParam.levels[player.getLevelNo() - 1].getStrTime();//���㴳�ط���
					if (player.getCurScore() == score) {
						System.out.println("���Ѵ��سɹ�");
						System.exit(0);
					}
				}
			}
			// ����������
		} else {
			System.out.println("��������˳���");
			System.exit(1);
		}
	}
}
