package com.shaodq.chapter2.d20180721;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
         
        System.out.println("������һ����λ��:");
        int card=input.nextInt();
        
        if(card>=1000&&card<10000){
        	//������ʾʲô
        }else{
        	System.out.println("������Ĳ���һ����λ��.");
        	return;
        }
        
        //���������ж��ܹ�ͨ���������ǵĴ���������¼���ִ��
        //��ʼ�ֽ�
        //�����ĸ���������������ֽ�����ĸ�λ�ϵ�����
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
        	System.out.println("��ϲ�����н���");
        }else{
        	System.out.println("��û���н�");
        }
       
	}

}
