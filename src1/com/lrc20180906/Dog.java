package com.lrc20180906;

public class Dog {

	private String name="������";
	private int health=100;
	private int love=0;
	private String strain="������С��";
	
	public Dog(String name,String strain){
		this.name=name;
		this.strain=strain;
		
		
	}
	
	public void eat(){
		if (health>=100) {
			System.out.println("С����Ӧ�ö��˶�");
		} else {
                  health=health+3;
                  System.out.println("�����óԷ���");
		}
		
		
		
	}
			
	public String getName(){
		
		return name;
		
		
	}
	
	public int getHealth(){
		return health;
		
		
		
		
	}
	
	
	public int getlove(){
		
		
		return love;
		
		
		
		
	}
	
	public String getStrain(){
		return strain;
		
		
		
		
	}
	
	public void print(){
		
		System.out.println("�ҵ�������"+this.name +"\t����ֵ��"+this.health+"�����˵����ܶ���\t"+this.love+"����һֻ"+this.strain);
		
	}
	
	public static void main(String[] args) {
		Dog dog=new Dog("xiaogou", "1");
		 dog.print();
	}
	
}
