package com.Zoo5;

public class Test {
  public static void main(String[] args) {
	
	  Animal animals[] = new Animal[3];
		animals[0] = new Cat("Сè", 4);
		animals[1] = new Duck("����Ѽ", 2);
		animals[2] = new Dolphin("����");
		System.out.println("��������\t\t�ȵ�����\t\t�����");
		for (int i = 0; i < animals.length; i++){
			if (animals[i] instanceof Terrestrial) {//�ж��Ƿ�ʵ���˽ӿ�
				String name = animals[i].getName();
				int legNum = ((Terrestrial) animals[i]).getLegNum();
				System.out.print(name + "\t\t" + legNum + "\t\t");
				animals[i].shout();
			} else {
				String name = animals[i].getName();
				System.out.print(name + "\t\t" + 0 + "\t\t");
				animals[i].shout();
			}
		}
}
}
