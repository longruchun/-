package com.lrc20180910;

public class Dog {

	private String name;
	private int health=100;
	private int love=0;
	private String Strain="Ñ©ÇÁÈ®";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
	       
		if (health>100||health<0) {
			this.health=40;
			
		} else {

		}
		
		
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public String getStrain() {
		return Strain;
	}
	public void setStrain(String strain) {
		Strain = strain;
	}
	
	
	
}
