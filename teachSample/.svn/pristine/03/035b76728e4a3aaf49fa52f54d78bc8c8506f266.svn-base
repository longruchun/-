package com.shaodq.chapter2.d20180802;

import java.util.Scanner;

public class testHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
        Student[] stus=new Student[5];
        
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<stus.length;i++){
        	System.out.println("请输入第"+(i+1)+"个学员的身高:");
        	Student stu=new Student();
        	stu.height=input.nextInt();
        	stus[i]=stu;
        }
        
        for(int i=0;i<stus.length;i++){
        	System.out.println("第"+(i+1)+"位同学的身高:"+stus[i].height);
        }
        
        Height ht=new Height();
        float avg=ht.getAvg(stus);
        System.out.println("五位学员的平均身高是:"+avg);
	}

}
