package com.lrc20180905;

public class Penguin {
	

        static final String MALE="Q��";
        static final String FEMAIL="Q��";


        String name = "������"; // �ǳ�
	int health = 100; // ����ֵ
	int love = 0; // ���ܶ�
	String sex = "Q��"; // �Ա�
	/**
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name +
				"������ֵ��"	+ this.health + "�������˵����ܶ���" 
				+ this.love + "���Ա��� " + this.sex + "��");
	}
}
