package com.Zoo4;

public class Test {
  public static void main(String[] args) {
	
	  Animal animals[] = new Animal[3];
		animals[0] = new Cat("�ӷ�è", 4);
		animals[1] = new Duck("��СѼ", 2);
		animals[2] = new Dolphin("��������");
		System.out.println("��������\t\t�ȵ�����\t\t�����");
		for (int i = 0; i < animals.length; i++){
			if (animals[i] instanceof Terrestrial) {
				String name = animals[i].getName();
				int legNum = ((Terrestrial) animals[i]).getLegnum();
				System.out.print(name + "\t\t" + legNum + "\t\t");
				animals[i].Shout();
			} else {
				String name = animals[i].getName();
				System.out.print(name + "\t\t" + 0 + "\t\t");
				animals[i].Shout();
			}
		}
}
}
