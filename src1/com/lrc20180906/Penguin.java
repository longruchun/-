package com.lrc20180906;

public class Penguin {

	String name="������";
	int health=100;
	int love=0;
	
	static final String SEX_MALE="Q��";
	static final String SEX_FEMALE="Q��";
	
	String sex=SEX_MALE;//�Ա�
	
	
	public void print(){
		
		System.out.println("�����������"+this.name+"\n����ֵ��"+this.health+"\n�����˵����ܶ���"+this.love+"\n�Ա���"+this.sex+"��");
		
	}
	
	public static void main(String[] args) {
		 Penguin pg=new  Penguin();
		 pg.print();
		
	}
	
	
}
