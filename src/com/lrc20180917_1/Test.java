package com.lrc20180917_1;

import java.awt.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
   
   for (int i = 0; i < pgs.size(); i++) {
	   
	   Penguin p5= (Penguin)pgs.get(i);
	   System.out.println(p5.getName()+"\t" +p5.getSex()    );
	   
	   
	   
	   
	
}
   
   
   
   
		
		
	}

}
