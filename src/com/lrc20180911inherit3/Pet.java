package com.lrc20180911inherit3;

public class Pet {
   String name="����";
    int health=100;
   int love=20;
   
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
