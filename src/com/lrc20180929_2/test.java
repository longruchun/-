package com.lrc20180929_2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Igrade dao=new grade_jdbcDao();
		Scanner input=new Scanner(System.in);
		
		String gradeName="";
		int gradeid=0;
		grade ga=null;
		
		while(true) {
			System.out.println("======�꼶ά���˵�======");
			System.out.println("1 ����꼶");
			System.out.println("2 �޸��꼶");
			System.out.println("3 ɾ���꼶");
			System.out.println("4 �鿴�����꼶");
			System.out.println("0 �˳�");
			System.out.println("---------------------");
			System.out.println("��ѡ��:");
			
			
			int choice=input.nextInt();
			
			switch(choice) {
			case 0:
				break;
			case 1:
				System.out.println("�������������� :");
				gradeName=input.next();
				ga=new grade(gradeName);
				dao.add(ga);
				continue;
			case 2:
				System.out.println("������������� :");
				gradeid=input.nextInt();
				System.out.println("������Ҫ�޸ĵ��꼶���� :");
				gradeName=input.next();
				ga=new grade(gradeid,gradeName);
				dao.update(ga);
				continue;
			case 3:
				System.out.println("������Ҫɾ�����꼶��� :");
				gradeid=input.nextInt();
				
				dao.delete(gradeid);
				continue;
			case 4:
				
				List list=dao.getAll();
				List grade_list=(ArrayList)list.get(1);
				
				Iterator it=grade_list.iterator();
				while(it.hasNext()) {
					grade gr=(grade)it.next();
					System.out.println(gr.getGradeid()+"\t"+gr.getGradeName());
				}
				
				
				continue;

			default:
				continue;
			
			}
			
			break;
			
		}
        
	}

}
