package com.lrc20180911Polymorphism;

public class Dog extends Pet {
      public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	private String strain;
      

    
	
	public String getStrain() {
		return strain;
	}



	public void setStrain(String strain) {
		this.strain = strain;
	}



	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

}
