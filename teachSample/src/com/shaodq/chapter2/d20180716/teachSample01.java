package com.shaodq.chapter2.d20180716;

import java.util.Scanner;

public class teachSample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //continue �ؼ� ����ѭ ���е�ʹ��
		//�����:ĳ���˶����ϱ����ˣ�ÿ��һȦ������ѯ���Ƿ���Ҫ��ˮ������Ҫ������ˮ�����ܣ�������Ҫ���ͼ�����
		Scanner input =new Scanner(System.in);
		
		String answer;
		
		String  tired;
		
		for(int i=0;i<15;i++){
			System.out.println("ѡ���ܵ�"+(i+1)+"Ȧ");
			
			System.out.println("�����ʣ�Ҫ��ˮ��?(y Or n)");
			answer=input.next();
			
			System.out.println("�����ʣ��۵��޷������?(y Or n)");
			tired=input.next();
			
			if(answer.equals("n")){
				//���ѡ�ֻش�"����"---���ǲ���ˮ,��Ҫ�����������������һ��"��ˮ"����ִ��
				continue;
			}
			
			if(tired.equals("y")){
				break;
			}
			
			System.out.println("ѡ�ֺ�ˮ");
			
		}
		
		
		
	}

}
