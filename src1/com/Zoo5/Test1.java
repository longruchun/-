package com.Zoo5;

public class Test1 {
   public static void main(String[] args) {
	/*Cat cat=new Cat("�ӷ�è",4);
	Dolphin dolphin=new Dolphin("��������");
	System.out.println(cat instanceof Cat);
	System.out.println(cat instanceof Animal);
	System.out.println(cat instanceof Terrestrial);
	System.out.println(dolphin instanceof Terrestrial);*/
	   
	   
	   Animal animals[] = new Animal[3];
		animals[0] = new Cat("Сè", 4);
		animals[1] = new Duck("����Ѽ", 2);
		animals[2] = new Dolphin("����");
		System.out.println("��������\t\t�ȵ�����\t\t�����");
		
		for (int i = 0; i < animals.length; i++) {
			
			
			if (animals[i] instanceof Terrestrial ) {
				
				//Terrestrial  t1=()
				
			} else {

			}
			
			
		}
	
	
}
}
