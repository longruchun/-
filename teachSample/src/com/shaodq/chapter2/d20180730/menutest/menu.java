package com.shaodq.chapter2.d20180730.menutest;

import java.util.Scanner;

public class menu {
   
   boolean loginStatus;//��ʶ�Ƿ��¼��	��Ϊ����һ����Ա��������Ĭ��ֵΪ��
   String[][] userInfos={{"zs","123"},{"ls","456"},{"ww","789"}};//�û�������������
   
   public void login(){
	   if (!loginStatus) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("�������û����� :");
			String name = input.next();
			System.out.print("�������û����� :");
			String pass = input.next();
			for (int i = 0; i < userInfos.length; i++) {
				if (name.equals(userInfos[i][0]) && pass.equals(userInfos[i][1])) {
					loginStatus = true;//��¼״̬��ʶ����Ϊ�棬�����û��ǳɹ���¼�˵ģ�����Ӧ�ý������õ�¼�ɹ���ʶ��
					                   //һֱ����Ϊ�棬�����û������ظ���¼
					System.out.println("��¼�ɹ�����ӭ����ϵͳ.");
					break;
				}
			} 
			
			if(!loginStatus){
				System.out.println("��¼ʧ�ܣ�����Ȩ����ϵͳ");
			}
	   }
	   
   } 
   
	
   public void topmenu(){
	   System.out.println("\t��ӭʹ���������ع������ϵͳ");
	   System.out.println("\t\t1. ��¼ϵͳ");
	   System.out.println("\t\t2. �˳�");
	   System.out.println("\t....................");
   }
   
   public void mainmenu(){
	   System.out.println("\t��ӭʹ���������ع������ϵͳ���˵�");
	   System.out.println("\t....................");
	   System.out.println("\t\t1. �ͻ���Ϣ����");
	   System.out.println("\t\t2. �������");
	   System.out.println("\t....................");
   }
   
   public void level2menu(){
	   System.out.println("\t��ӭʹ���������ع������ϵͳ > �������");
	   System.out.println("\t....................");
	   System.out.println("\t\t1. ���˴����");
	   System.out.println("\t\t2. ���˳齱");
	   System.out.println("\t....................");
   }
   
   public void tips(){
	   System.out.println("��ѡ��");
   }
   
   
}
