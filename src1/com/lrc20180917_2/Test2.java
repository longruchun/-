package com.lrc20180917_2;

import java.util.ArrayList;
import java.util.Iterator;

import com.lrc20180917_1.Penguin;

public class Test2 {
   public static void main(String[] args) {
	   Penguin p1=new Penguin("ouou","Q仔");
	   Penguin p2=new Penguin("qiqi","Q妹");	
	   Penguin p3=new Penguin("tutu","Q仔");	
	   Penguin p4=new Penguin("kangkang","Q妹");	
	   
	    ArrayList pgs=new ArrayList(); 
	    pgs.add(p1);
	    pgs.add(p2);
	    pgs.add(p3);
	    pgs.add(p4);
	    System.out.println("企鹅数量是"+pgs.size()+"个");
	    System.out.println("删除之前企鹅的信息如下");
	    
	    Iterator it=pgs.iterator();
	    
	    while (it.hasNext()) {
			  Penguin p = (  Penguin ) it.next();
			System.out.println(p.getName()+"\t"+p.getSex());
		}
	    
	    
	   
	   
	   
}
}
