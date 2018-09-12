package com.lrc20180912_6;

public class Test {
   public static void main(String[] args) {
	
	   AccpTeacher t=new AccpDBTeacher();
	   t.giveLesson();
	   AccpDBTeacher a=new AccpDBTeacher();
	   a.sayHi();
	   a.giveLesson();
	   //t.sayHi();
}
}
