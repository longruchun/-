package com.shaodq.chapter1.d20180706;

import java.util.Scanner;

public class teachSample_5 {

	public static void main(String[] args) {
		//从键 盘上任意输入一个四位数，比如：7184，
		//将这个四位数，按个，十，百，千位各个分离出来.4  8   1  7
		//分别打印出来
		
		//思路解析：
		//两大步骤：
		//一    完成从键盘上接收一个四位数
		   //1  定义输入器
		   Scanner input =new Scanner(System.in);
		   //2 提示用户输入数据
		   System.out.println("请输入任意一个四位数:");
		   int num=(int)input.nextDouble();
		   //3 数据验证
		   if(num<1000||num>9999){
			   System.out.println("输入的数据不合法.");
			   return;
		   }
		//二    分离这个四位数
		  //1  将这个数除以1000  100  10  来进行分解
		  //再定义一个变量，记录原始的输入值
		  int original=num; 
		  
		  int first=num/1000;  
		  num=num%1000; 
		  
		  int second=num/100;
		  num=num%100;
		  
		  int third=num/10;
		  num=num%10;
	   //三   拼装显示结果的字符串并显示结果  
		  String content="您输入的原始数据："+original+",经分解后，构成如下:\n";
		  content+="\t个位数:"+num+";\n";
		  content+="\t十位数:"+third+";\n";
		  content+="\t百位数:"+second+";\n";
		  content+="\t千位数:"+first+";\n";
		  
		  System.out.println(content);
	}

}
