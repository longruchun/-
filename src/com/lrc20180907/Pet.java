package com.lrc20180907;

public class Pet {
    private String name="����";
    private int health=100;
    private int love=0;
	
	
	public  Pet() {
		this.health=95;
		System.out.println("ִ�г�����޲ҷ���");
		
		
		
		
	}
	
	public Pet(String name) {
		
		
		this.name=name;
		
	}
	
	public  String   getName() {
		
		
		
		return name;
	}
	
	
  public  int  gethealth() {
		
		
		
		return health;
	}
	
	
  public  int  getlove() {
	
	
	
	return love;
  }

  public void print() {
	
	
	System.out.println("�ҵ����ֽ�"+this.name+"\n����ֵ��"+this.health+"\n�Һ����˵����ܶ���"+this.love    );
	
	
 }
	
}
