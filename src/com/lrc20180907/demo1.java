package com.lrc20180907;

public class demo1 {
	String name = "������"; // �ǳ�
	int health = 100; // ����ֵ
	int love = 0; // ���ܶ�
	static String SEX_MALE ="Q��";
	static String SEX_FEMALE="Q��";
	//static final String SEX_MALE = "��";
	//static final String SEX_FEMALE = "��";
	String sex = SEX_MALE; // �Ա�
	
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name 
				+ "������ֵ��" + this.health 	+ "�������˵����ܶ���" 
				+ this.love + "���Ա��� " + this.sex + "��");
	}
	
	
	public static void main(String[] args) {
		demo1.SEX_FEMALE="Q��";
		demo1.SEX_MALE="Q��";
		demo1 d=new demo1();
		d.print();
		
		
		
	}
}
