package com.lrc20180907;

public class demo1 {
	String name = "无名氏"; // 昵称
	int health = 100; // 健康值
	int love = 0; // 亲密度
	static String SEX_MALE ="Q仔";
	static String SEX_FEMALE="Q妹";
	//static final String SEX_MALE = "雄";
	//static final String SEX_FEMALE = "雌";
	String sex = SEX_MALE; // 性别
	
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name 
				+ "，健康值是" + this.health 	+ "，和主人的亲密度是" 
				+ this.love + "，性别是 " + this.sex + "。");
	}
	
	
	public static void main(String[] args) {
		demo1.SEX_FEMALE="Q妹";
		demo1.SEX_MALE="Q仔";
		demo1 d=new demo1();
		d.print();
		
		
		
	}
}
