package com.shaodq.chapter2.d20180730.menutest;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        menu menu1=new menu();
        Scanner input=new Scanner(System.in);
        
        //���һ����������¼��ǰ�˵�������һ��
        int level=0;
        int choice=-1;
        
        while(true){
        	switch(level){
	        	case 0:
	        		menu1.topmenu();
	        		
	        		//��ʾ�û�ѡ��˵��� 
	        		menu1.tips();
	        		choice=input.nextInt();
	        		
	        		switch(choice){
		        		case 1:
		        			menu1.login();
		        			if(menu1.loginStatus){
			        			level=1;
			        			choice=-1;
		        			}else{
		        				level=0;
			        			choice=-1;
		        			}
		        			continue;
		        		case 2:
		        			System.out.println("��ѡ�����˳�ϵͳ����ӭ�´ι���.");
		        			break;//�����ڲ�switch
		        		default:
		        			System.out.println("�������.");
		        			continue;
	        		}
	        		
	        		
	        		break;//�������switch
	        	case 1:
	        		menu1.mainmenu();
	        		
	        		//��ʾ�û�ѡ��˵���
	        		menu1.tips();
                    choice=input.nextInt();
	        		
	        		switch(choice){
	        		    case 0:
	        		    	level=0;
		        			choice=-1;
		        			continue;
		        		case 1:
		        			level=1;
		        			choice=-1;
		        			System.out.println("\"�ͻ���Ϣ���������ڿ���������......\"");
		        			continue;
		        		case 2:
		        			level=2;
		        			choice=-1;
		        			continue;//�����ڲ�switch
		        		default:
		        			System.out.println("�������.");
		        			level=1;
		        			choice=-1;
		        			continue;
	        		}
	        		
	        	case 2:
	        		menu1.level2menu();
	        		
	        		//��ʾ�û�ѡ��˵��� 
	        		menu1.tips();
                    choice=input.nextInt();
	        		
	        		switch(choice){
	        		    case 0:
	        		    	level=1;
		        			choice=-1;
		        			continue;
		        		case 1:
		        			
		        			System.out.println("��ѡ����\"���˴����......\"");
		        			continue;
		        		case 2:
		        			System.out.println("��ѡ����\"���˳齱......\"");
		        			continue;//�����ڲ�switch
		        		default:
		        			System.out.println("�������.");
		        			choice=-1;
		        			continue;
	        		}
	        	    
        	}
        	
        	break;//������ѭ�� 
        }
        
        
        System.out.println("�������(�˵�ѭ ������).");
	}

}
