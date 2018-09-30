package com.lrc20180915_1;

import java.awt.List;
import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Penguin p1=new    Penguin("琪琪","Q仔");
        Penguin p2=new    Penguin("奇奇","Q妹");
        Penguin p3=new    Penguin("阿娜","Q妹");
        Penguin p4=new    Penguin("菲菲","Q妹");
        Penguin p5=new    Penguin("兔兔","Q妹");
        
        ArrayList p=new ArrayList();
        p.add(p1);        
        p.add(p2);  
        p.add(p3);
        p.add(p4);  
        p.add(p5);  
        
        System.out.println("共有"+p.size()+"只企鹅");
        
        System.out.println("删除之前分别是");
        
        for (int i = 0; i <p.size(); i++) {
        	
        	Penguin ps=(Penguin)p.get(i);
        	System.out.println(ps.getName()+"\t"+ps.getSex());
			
		}        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        
        if (p.contains("奇奇")) {
    		System.out.println("数组中有奇奇");
    	} else {
    		System.out.println("数组中没有奇奇");
    	} 
            
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        p.remove(0);
        p.remove(1);
        
        
        System.out.println("删除之后分别是");
        for (int i = 0; i <p.size(); i++) {
        	
        	Penguin ps=(Penguin)p.get(i);
        	System.out.println(ps.getName()+"\t"+ps.getSex());
			
		}        
        
        
    
        
        
	}

}
