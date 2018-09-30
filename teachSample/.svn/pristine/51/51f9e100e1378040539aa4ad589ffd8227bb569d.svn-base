package com.shaodq.chapter2.d20180721;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
         
        System.out.println("请输入一个四位数:");
        int card=input.nextInt();
        
        if(card>=1000&&card<10000){
        	//不用提示什么
        }else{
        	System.out.println("您输入的不是一个四位数.");
        	return;
        }
        
        //以上条件判断能够通过，则我们的代码可以往下继续执行
        //开始分解
        //声明四个变量，用来保存分解出来的各位上的数码
        int qian=-1;
        int bai=-1;
        int shi=-1;
        int ge=-1;
        
        qian=card/1000;
        bai=card%1000/100;
        shi=card%1000%100/10;
        ge=card%1000%100%10;
        
        System.out.println(qian);
        System.out.println(bai);
        System.out.println(shi);
        System.out.println(ge);
        
        if((qian+bai+shi+ge)%2==0){
        	System.out.println("恭喜，您中奖了");
        }else{
        	System.out.println("您没有中奖");
        }
       
	}

}
