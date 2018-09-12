package com.lrc20180912ploymorphism;

public class Master {
    String name;
    int money;
    
    
	
	public String getName() {
		return name;
	}

     

	public void setName(String name) {
		this.name = name;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public void cure(Pet pet) {
		
		pet.tohospital();
	}
	
	public void play(Pet pet) {
		if (pet instanceof Dog) {
			
			
			Dog dog=(Dog)pet;
			dog.catchingflyDisc();
			
		} else  if(pet instanceof  Penguin) {
			Penguin p=(Penguin)pet;
			p.Swimming();
		}
		
		
	}
}
