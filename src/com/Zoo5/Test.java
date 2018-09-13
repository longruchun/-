package com.Zoo5;

public class Test {
  public static void main(String[] args) {
	
	  Animal animals[] = new Animal[3];
		animals[0] = new Cat("小猫", 4);
		animals[1] = new Duck("唐老鸭", 2);
		animals[2] = new Dolphin("海豚");
		System.out.println("动物名字\t\t腿的条数\t\t动物叫");
		for (int i = 0; i < animals.length; i++){
			if (animals[i] instanceof Terrestrial) {//判断是否实现了接口
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
