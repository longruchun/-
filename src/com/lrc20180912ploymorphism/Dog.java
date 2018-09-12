package com.lrc20180912ploymorphism;

public class Dog extends Pet {

	@Override
	public void tohospital() {
		// TODO Auto-generated method stub
         this.health=40;
         System.out.println("狗狗去医院看病");
		
		
		
	}

	
	
	public void  catchingflyDisc() {
		super.health=super.health-10;
		super.love=super.love+5;
		System.out.println("狗狗在玩飞盘");
		
		
	}
}
