package com.lrc20180912ploymorphism;

public class Penguin extends Pet {

	@Override
	public void tohospital() {
		// TODO Auto-generated method stub
         this.health=50;
         System.out.println("���ȥҽԺ����");
	}

	
	public void Swimming() {
		super.health=super.health-10;
		super.love=super.love+5;
		System.out.println("���������Ӿ");
		
	}
	
}
