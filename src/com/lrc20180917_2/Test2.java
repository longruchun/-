package com.lrc20180917_2;

import java.util.ArrayList;
import java.util.Iterator;

import com.lrc20180917_1.Penguin;

public class Test2 {
   public static void main(String[] args) {
	   Penguin p1=new Penguin("ouou","Q��");
	   Penguin p2=new Penguin("qiqi","Q��");	
	   Penguin p3=new Penguin("tutu","Q��");	
	   Penguin p4=new Penguin("kangkang","Q��");	
	   
	    ArrayList pgs=new ArrayList(); 
	    pgs.add(p1);
	    pgs.add(p2);
	    pgs.add(p3);
	    pgs.add(p4);
	    System.out.println("���������"+pgs.size()+"��");
	    System.out.println("ɾ��֮ǰ������Ϣ����");
	    
	    Iterator it=pgs.iterator();
	    
	    while (it.hasNext()) {
			  Penguin p = (  Penguin ) it.next();
			System.out.println(p.getName()+"\t"+p.getSex());
		}
	    
	    
	   
	   
	   
}
}
