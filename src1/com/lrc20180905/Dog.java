package com.lrc20180905;


public class Dog {
	String name = "������"; // �ǳƣ�Ĭ��ֵ��"������"
	int health = 100; // ����ֵ����Ĭ��ֵ��100
	int love = 0; // ���ܶ�
	String strain = "��������������Ȯ"; // Ʒ��
	/**
	 * �����������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"������ֵ��"	+ this.health + "�������˵����ܶ���"
				+ this.love + "������һֻ " + this.strain + "��");
	}
}
