package com.shaodq.chapter2.d20180730.showfist;

import java.util.Scanner;

public class Player {
    public String name;//������¼�������
    public int score;//������¼��ҵĻ�ʤ����
    
    
    /**
     * 
     * @return  ��ҵĳ�ȭ  1 ����    2  ʯͷ   3 ��
     */
    //��ҳ�ȭ����
    public int ShowFist(){
    	int fist=0;
    	Scanner input=new Scanner(System.in);
    	System.out.println("������ȭ(1. ����    2. ʯͷ   3. ��)");
    	fist=input.nextInt();
    	
    	switch(fist){
    	    case 1:
    	    	System.out.println("��ҳ�ȭ:����");
    	    	break;
    	    case 2:
    	    	System.out.println("��ҳ�ȭ:ʯͷ");
    	    	break;
    	    case 3:
    	    	System.out.println("��ҳ�ȭ:��");
    	    	break;
    		default:
    			System.out.println("ѡ�����Ĭ����ҳ�����");
    			fist=1;
    			break;
    	}
 
    	return fist;
    }
}
