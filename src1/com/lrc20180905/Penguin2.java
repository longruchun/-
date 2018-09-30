package com.lrc20180905;

public class Penguin2 {

	   String name="没得名字";
	   int heath=100;
	   int love=0;
	   String sex="Q仔";
	   
	   public Penguin2() {
		   
		  name="琪琪";
		  love=20;
		  sex="男";
		  System.out.println("执行构造方法");
				
		   
		   
	   }
	   
	   public Penguin2(String name,String sex) {
		   
			 this.name=name;
			 
			 this.sex=sex;
			
					
			   
			   
		   }
		   
	   public Penguin2(String name,int health,int love,String sex) {
		   
			 this.name=name;
			 this.sex=sex;
			 this.love=love;
			 this.sex=sex;
					
			   
			   
		   }
	   
	   
	   
	 public void print() {
		 System.out.println("宠物的名字是"+this.name+"\t宠物的健康值是"+this.heath+"\t和主人的亲密度是"+this.love+"\t性别是"+this.sex);
		 
		 
		 
	 }
	  
	   
	   
	   
	public static void main(String[] args) {
		Penguin2 pg=null; 
		
		pg=new Penguin2();
		pg.print();
		 
		pg=new Penguin2("亚亚","企鹅");
		pg.print();
		 
		pg=new Penguin2("美美",80,20,"Q仔");
		pg.print();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
