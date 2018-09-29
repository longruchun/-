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
			System.out.println("======年级维护菜单======");
			System.out.println("1 添加年级");
			System.out.println("2 修改年级");
			System.out.println("3 删除年级");
			System.out.println("4 查看所有年级");
			System.out.println("0 退出");
			System.out.println("---------------------");
			System.out.println("请选择:");
			
			
			int choice=input.nextInt();
			
			switch(choice) {
			case 0:
				break;
			case 1:
				System.out.println("请输入所级名称 :");
				gradeName=input.next();
				ga=new grade(gradeName);
				dao.add(ga);
				continue;
			case 2:
				System.out.println("请输入所级编号 :");
				gradeid=input.nextInt();
				System.out.println("请输入要修改的年级名称 :");
				gradeName=input.next();
				ga=new grade(gradeid,gradeName);
				dao.update(ga);
				continue;
			case 3:
				System.out.println("请输入要删除的年级编号 :");
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
