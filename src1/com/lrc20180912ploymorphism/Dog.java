package com.lrc20180912ploymorphism;

public class Dog extends Pet {

	@Override
	public void tohospital() {
		// TODO Auto-generated method stub
         this.health=40;
         System.out.println("����ȥҽԺ����");
		
		
		
	}

	
	
	public void  catchingflyDisc() {
		super.health=super.health-10;
		super.love=super.love+5;
		System.out.println("�����������");
		
		
	}
}
