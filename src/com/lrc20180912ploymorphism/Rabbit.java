package com.lrc20180912ploymorphism;

public class Rabbit extends Pet {

	@Override
	public void tohospital() {
		// TODO Auto-generated method stub
         this.health=100;
         System.out.println("兔子去医院看病");
	}

}
 