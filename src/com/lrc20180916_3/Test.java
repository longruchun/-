package com.lrc20180916_3;

import java.util.ArrayList;

import com.lrc20180915_1.Penguin;

public class Test {
	
	public static void main(String[] args) {
		 Penguin p1=new    Penguin("����","Q��");
	     Penguin p2=new    Penguin("����","Q��");
	     Penguin p3=new    Penguin("����","Q��");
	     Penguin p4=new    Penguin("�Ʒ�","Q��");
	     Penguin p5=new    Penguin("����","Q��");
	     
	     ArrayList p=new ArrayList();
	     p.add(p1);        
	     p.add(p2);  
	     p.add(p3);
	     p.add(p4);  
	     p.add(p5);  
	     
	     System.out.println("����"+p.size()+"ֻ���");
	     
	     System.out.println("ɾ��֮ǰ�ֱ���");
	     
	     for (int i = 0; i <p.size(); i++) {
	     	
	     	Penguin ps=(Penguin)p.get(i);
	     	System.out.println(ps.getName()+"\t"+ps.getSex());
				
			}        
	     System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	     
	     
	     if (p.contains("����")) {
	 		System.out.println("������������");
	 	} else {
	 		System.out.println("������û������");
	 	} 
	         
	     System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	     p.remove(0);
	     p.remove(1);
	     
	     
	     System.out.println("ɾ��֮��ֱ���");
	     for (int i = 0; i <p.size(); i++) {
	     	
	     	Penguin ps=(Penguin)p.get(i);
	     	System.out.println(ps.getName()+"\t"+ps.getSex());
				
			}        
	     
	}
	
     
 
}
