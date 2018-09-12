package com.lrc20180911Polymorphism2;

public class Dog extends Pet {
    


	private String strain;
      

    
	



	


	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}










	public String getStrain() {
		return strain;
	}










	public void setStrain(String strain) {
		this.strain = strain;
	}










	@Override
	public void eat() {
		super.health=super.health+3;
		System.out.println("狗狗"+super.name+"吃饱了健康值增加3");
		// TODO Auto-generated method stub

	}

}
