package com.lrc20180912_9;
public class Penguin extends Pet implements Eatable, Swimmable {
	private String sex ="Q��";//�Ա�
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"���ҵĽ���ֵ��"	+ this.health + "���Һ����˵����̶ܳ���"
				+ this.love + ",�ҵ��Ա���"+this.sex+ "��");
	}
	public void eat() {
		super.health = super.health + 5;
		System.out.println("���" + super.name + "�Ա���������ֵ����5��");
	}
	public void swim() {
		System.out.println("���" + super.name + "������Ӿ��");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
