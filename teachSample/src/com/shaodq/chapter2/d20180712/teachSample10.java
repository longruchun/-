package com.shaodq.chapter2.d20180712;



public class teachSample10 {

	public static void main(String[] args) {
		double line=100;
		double speed=10;
		double rate=0.1;
		
		double change_long=0;
		double totle=0;
		
		int count=0;//ͳ��Ҫ������
		//���㣺��Ҫ���������룬����ÿ�������ﵽ10������
		while(true){
			count++;
			change_long=line*rate;
			if(change_long>=10){
				break;
			}
			line*=1.01;
		}
		
		totle=count*10;
		
		if(totle>line){
			System.out.println("��������");
		}else{
			System.out.println("����ȥ");
		}
		
		
    	  
    	  
	}

}
