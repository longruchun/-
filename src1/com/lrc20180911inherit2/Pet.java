package com.lrc20180911inherit2;

public class Pet {
   private String name="无名";
   private int health=100;
   private int love=20;
   
   public void  print() {
	   
	   System.out.println("宠物的名字是"+this.name+"\t宠物的健康值是"+this.health+"\t与主人的亲密度是"+this.love);
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
