package com.shaodq.chapter2.d20180802;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student stu1=new Student();
        stu1.java=93;
        stu1.database=100;
        stu1.html=99;
        
        Score sc=new Score();
        System.out.println("��ѧԱ���ſε�ƽ������:"+sc.getAvg(stu1));
	}

}
