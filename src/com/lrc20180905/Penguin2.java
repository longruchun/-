package com.lrc20180905;

public class Penguin2 {

	   String name="û������";
	   int heath=100;
	   int love=0;
	   String sex="Q��";
	   
	   public Penguin2() {
		   
		  name="����";
		  love=20;
		  sex="��";
		  System.out.println("ִ�й��췽��");
				
		   
		   
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
		 System.out.println("�����������"+this.name+"\t����Ľ���ֵ��"+this.heath+"\t�����˵����ܶ���"+this.love+"\t�Ա���"+this.sex);
		 
		 
		 
	 }
	  
	   
	   
	   
	public static void main(String[] args) {
		Penguin2 pg=null; 
		
		pg=new Penguin2();
		pg.print();
		 
		pg=new Penguin2("����","���");
		pg.print();
		 
		pg=new Penguin2("����",80,20,"Q��");
		pg.print();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
