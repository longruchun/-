package com.lrc20180917_1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Penguin p1=new Penguin("ouou","Q仔");
  Penguin p2=new Penguin("qiqi","Q妹");	
  Penguin p3=new Penguin("tutu","Q仔");	
  Penguin p4=new Penguin("kangkang","Q妹");	
  
   ArrayList<Penguin> pgs=new ArrayList<Penguin>(); 
   pgs.add(p1);
   pgs.add(p2);
   pgs.add(p3);
   pgs.add(p4);
   System.out.println("企鹅数量是"+pgs.size()+"个");
   System.out.println("删除之前企鹅的信息如下");
   
   Iterator<Penguin> it=pgs.iterator();
   while (it.hasNext()) {
	Penguin penguin = (Penguin) it.next();
	
	System.out.println(penguin.getName()+"\t"+penguin.getSex());
	
}
   
   
   
   
   
		
		
	}

}
