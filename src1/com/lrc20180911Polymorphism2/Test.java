package com.lrc20180911Polymorphism2;

public class Test {
  public static void main(String[] args) {
	Dog dog=new Dog("Å¼Å¼","Ñ©Èğ");
	Penguin pgn=new Penguin("À¼À¼","QÃÃ");
	Master master=new Master("ÍõÏÈÉú",100);
	master.feed(dog);
	master.feed(pgn);
	  
}
}
