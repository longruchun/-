package com.lrc20180912ploymorphism;

public class Test {

	public static void main(String[] args) {
		
		/*Master m=new Master();
		Pet pet=new Dog();
		m.cure(pet);
		
		Pet pet1=new Penguin();
		m.cure(pet1);//调用主人类里面的治愈方法
		
		Pet pet2=new Rabbit();
		m.cure(pet2 );*/
		
		
		Dog dog=new Dog();
		Penguin pgn=new Penguin();
		
		Master master=new Master();
		 master.play(dog);
		 master.play(pgn);
		
		
		
	}
	
}
