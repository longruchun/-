package com.shaodq.chapter2.d20180710;

import java.util.Scanner;

public class teachSample4 {

	public static void main(String[] args) {
	   //�Ӽ��̽���һ���ַ��� ��Сд��ĸ����֮��д��ʽ��
		Scanner input=new Scanner(System.in);
		/*System.out.println("������һ��Сд��ĸ��");
		char ch=input.next().charAt(0);
		System.out.println("�������Сд��ĸ��"+ch+" ��Ӧ�Ĵ�д��ĸ��:"+(char)(ch-32));*/
		
		//System.out.println('a'-'A');
		//���һ����������¼ÿ�����ж�����
		int days=0;
		
		System.out.println("�������·ݣ�");
		int month=input.nextInt();
		System.out.println("���������ڣ�");
		int day=input.nextInt();
		
		/*switch(month){
		   case 1:
			   days+=day;
			   break;
		   case 2:
			   days+=31;
			   days+=day;
			   break;
		   case 3:
			   days+=31+28;
			   days+=day;
			   break;
		   case 4:
			   days+=31+28+31;
			   days+=day;
			   break;
		   case 5:
			   days+=31+28+31+30;
			   days+=day;
			   break;  	   
		
		}*/
		
		switch(month){
			case 12:
				if(month==12){
					days+=day;
				}else{
					days+=31;
				}
			case 11:
				if(month==11){
					days+=day;
				}else{
					days+=30;
				}
		    case 10:
				if(month==10){
					days+=day;
				}else{
					days+=31;
				}
			case 9:
				if(month==9){
					days+=day;
				}else{
					days+=30;
				}
			case 8:
				if(month==8){
					days+=day;
				}else{
					days+=31;
				}
			case 7:
				if(month==7){
					days+=day;
				}else{
					days+=31;
				}
			case 6:
				if(month==6){
					days+=day;
				}else{
					days+=30;
				}
		    case 5:
				if(month==5){
					days+=day;
				}else{
					days+=31;
				}
			case 4:
				if(month==4){
					days+=day;
				}else{
					days+=30;
				}
			case 3:
				if(month==3){
					days+=day;
				}else{
					days+=31;
				}
			case 2:
				if(month==2){
					days+=day;
				}else{
					days+=28;
				}
			case 1:
				if(month==1){
					days+=day;
				}else{
					days+=31;
				}	
			}
		System.out.println("�����������:"+month+"��"+day+"��,�Ǹ���ĵ�"+days+"��");
	}

}
