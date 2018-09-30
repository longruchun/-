package com.Zoo4;

public class Duck extends Animal implements Terrestrial {
	private String name;
	private int legNum;
	@Override
	public int getLegnum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Shout() {
		// TODO Auto-generated method stub
    System.out.println("¸Â¸Â");
	}

	public Duck(String name, int legNum) {
		super();
		this.name = name;
		this.legNum = legNum;
	}

	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegNum() {
		return legNum;
	}

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
  
	*/
	
	
}
