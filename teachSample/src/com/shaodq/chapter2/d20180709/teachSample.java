package com.shaodq.chapter2.d20180709;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �°�ؼң�ʱ����֣� ��·���������˳�
		// ���÷�֧����
		// 1 ��һ�ַ�ʽ�����һ�����������ķ�ʽ
		boolean isEnough = true;

		if (isEnough) {
			System.out.println("��ɢ���ķ�ʽ�����߻�ȥ");
		} else {
			System.out.println("�˳��ؼ�ʡ��ʱ��");
		}

		// 2 �ڶ��ַ�ʽ�������������У���������һ��������Ϊ�������͵ı��ʽ
		// �ҵ�ʱ���Ƿ��֣�Ҫ�������������1������ɿ�����ҵ��ʱ�� 2�����������5Ȧ���ܵ�ʱ��
		int homeWorkTime = 10;
		int runTime = 8;

		if (homeWorkTime <= 10 && runTime <= 10) {
			System.out.println("��ɢ���ķ�ʽ�����߻�ȥ");
		} else {
			System.out.println("�˳��ؼ�ʡ��ʱ��");
		}

	}

}
