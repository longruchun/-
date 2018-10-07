package com.lrc.presentation;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hxzy.biz_implements.gradeBiz_jdbcImpl;
import com.hxzy.biz_implements.subjectBiz_jdbcImpl;
import com.hxzy.biz_interface.IgradeBiz;
import com.hxzy.biz_interface.IsubjectBiz;
import com.hxzy.entity.grade;
import com.hxzy.entity.subject;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IgradeBiz biz=new gradeBiz_jdbcImpl();
		IsubjectBiz sbiz=new subjectBiz_jdbcImpl();
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
			System.out.println("5 �鿴���п�Ŀ");
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
				biz.add(ga);
				continue;
			case 2:
				System.out.println("������������� :");
				gradeid=input.nextInt();
				System.out.println("������Ҫ�޸ĵ��꼶���� :");
				gradeName=input.next();
				ga=new grade(gradeid,gradeName);
				biz.Update(ga);
				continue;
			case 3:
				System.out.println("������Ҫɾ�����꼶��� :");
				gradeid=input.nextInt();
				
				biz.delete(gradeid);
				continue;
			case 4:
				
				List<grade> list;
				try {
					list = biz.getAll();
					Iterator<grade> it=list.iterator();
					
					
					
					while(it.hasNext()) {
						    grade gr=it.next();
							System.out.println(gr.getGradeId()+"\t"+gr.getGradeName());
						
					}
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				continue;
                case 5:
				
				List<subject> list1;
				try {
					list1 = sbiz.getAll();
					Iterator<subject> it=list1.iterator();
					
					
					
					while(it.hasNext()) {
						    subject sb=it.next();
							System.out.println(sb.getSubjectNo()+"\t"+sb.getSubjectName());
						
					}
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				continue;  
			default:
				continue;
			
			}
			
			break;
			
		}
        
	}

}
