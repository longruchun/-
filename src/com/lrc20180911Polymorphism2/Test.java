package com.lrc20180911Polymorphism2;

public class Test {
  public static void main(String[] args) {
	Dog dog=new Dog("żż","ѩ��");
	Penguin pgn=new Penguin("����","Q��");
	Master master=new Master("������",100);
	master.feed(dog);
	master.feed(pgn);
	  
}
}
