package com.Zoo5;

public class Test1 {
   public static void main(String[] args) {
	/*Cat cat=new Cat("加菲猫",4);
	Dolphin dolphin=new Dolphin("海豚琪琪");
	System.out.println(cat instanceof Cat);
	System.out.println(cat instanceof Animal);
	System.out.println(cat instanceof Terrestrial);
	System.out.println(dolphin instanceof Terrestrial);*/
	   
	   
	   Animal animals[] = new Animal[3];
		animals[0] = new Cat("小猫", 4);
		animals[1] = new Duck("唐老鸭", 2);
		animals[2] = new Dolphin("海豚");
		System.out.println("动物名字\t\t腿的条数\t\t动物叫");
		
		for (int i = 0; i < animals.length; i++) {
			
			
			if (animals[i] instanceof Terrestrial ) {
				
				//Terrestrial  t1=()
				
			} else {

			}
			
			
		}
	
	
}
}
