package com.shaodq.chapter1.d20180707;

import java.util.Random;

public class teachSample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //与 运算      逻辑与    与   短路与
		//与运算：参预运算的两个操作数（或是两个表达式），同真则真(最终表达式的取值为真)---所以要分别判定两个表达式的值
		//逻辑与:在任何情况下，两个表达式的值都 要去计算
		//短路与:
		//举案例 讲解逻辑与
		
		
		/*int i=9;
		int j=19;
		
		if(++i>10&&++j>10){
			System.out.println("i,j两个变量加1 后都 大于10");
			System.out.println("i="+i+"\tj="+j);
		}else{
			System.out.println("i,j两个变量中至少有一个加 1后不 大于10");
			System.out.println("i="+i+"\tj="+j);
		}*/
		
		/*int m=10;
		int n=10;
		
		if(--m==9||--n==9){
			System.out.println("n="+n);
		}
		
		int k=80;
		
		if(k!=80){
			System.out.println("k不等于80");
		}
		
		if(!(k%3==0)){
			System.out.println("k不能够被3整 除");
		}*/
		
		
		/*boolean b1=true;
		boolean b2=false;
		
		System.out.println(b1^b2);*/
		
		Random rd=new Random();
		/*int n=0;
		while(n<10){
		   System.out.println(rd.nextInt(1000));
		   n++;
		}*/
		
		int n1=rd.nextInt(100);
		int n2=rd.nextInt(100);
		if(n1%2==0^n2%2==0){
			System.out.println("随机产生的两个数中只有一个 能被2整除------代码走的是if分支");
			System.out.println("n1="+n1+"\tn2="+n2);
		}else{
			System.out.println("随机产生的两个数中要么能被2整除，要么都 不能被2整 除------代码走的是else分支");
			System.out.println("n1="+n1+"\tn2="+n2);
		}
		
		System.out.println(n1%2==0^n2%2==0);
		
		
		
		
	}

}
