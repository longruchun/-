package com.lrc20180911inherit2;

public class Pet {
   private String name="����";
   private int health=100;
   private int love=20;
   
   public void  print() {
	   
	   System.out.println("�����������"+this.name+"\t����Ľ���ֵ��"+this.health+"\t�����˵����ܶ���"+this.love);
   }

public String getName() {
	return name;
}

public int getHealth() {
	return health;
}

public int getLove() {
	return love;
}
	
	
	
}
