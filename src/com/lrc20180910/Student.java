package com.lrc20180910;

public class Student {
  private String sex;
  private int age;
  
public String getSex() {
	return sex;
}

public void setSex(String sex) {
	
	if (sex.equals("��")||sex.equals("Ů")) {
		this.sex = sex;
	} else {
        System.out.println("��������Ա�ֻ�У��к�Ů������Ĭ��Ϊ(��)");
        this.sex = "��";
	}
	
	
}

public int getAge() {
	
	
	
	return age;
}

public void setAge(int age) {
	
	if ( age<=100) {
		this.age = age;
	}else {
		
		System.out.println("�������û�г������ϵ���");
	}
	
}
 

public void print() {
	
	System.out.println("ѧ�����Ա���:"+this.sex+"\nѧ����������:"+this.age);
}
	

	
	
}
