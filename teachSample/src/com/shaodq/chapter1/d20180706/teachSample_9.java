package com.shaodq.chapter1.d20180706;

import java.util.Scanner;

public class teachSample_9 {

	public static void main(String[] args) {
		//三元运算符：实际上在实战运用中， 可以有效地替代一个if语法结构的使用，使得我们的代码简洁
		//请看以下案例 :
		//今天是礼拜日，如果天气晴朗，我去公园散散步;如果天气不好，我就在家里加强一下写代码的训练
		//这个案例 ， 我们即可以用if 结构来实现，也可以就用一个三元符进行
		
		boolean isSunShine=true;//定义一个变量表示天气是否晴朗
		
		/*if(isSunShine){
			System.out.println("去公园散步");
		}else{
			System.out.println("在家多历炼下代码");
		}*/
		
		System.out.println(isSunShine?"去公园散步":"在家多历炼下代码");//打印的括号中， 我直接以一个三元运算符，表示要打的内容
		
	}

}
