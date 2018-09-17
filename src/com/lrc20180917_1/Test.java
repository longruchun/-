package com.lrc20180917_1;

import java.awt.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
   
   for (int i = 0; i < pgs.size(); i++) {
	   
	   Penguin p5= (Penguin)pgs.get(i);
	   System.out.println(p5.getName()+"\t" +p5.getSex()    );
	   
	   
	   
	   
	
}
   
   
   
   
		
		
	}

}
