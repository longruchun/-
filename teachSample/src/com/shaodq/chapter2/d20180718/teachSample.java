package com.shaodq.chapter2.d20180718;

import java.util.Scanner;

public class teachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�˰���ѵ��Ҫ��:��˳����ϵĲ����㷨
		//���ݽṹ���㷨---�������ڴ��еĴ�ŷ�ʽ���Լ����������ִ淽ʽ��ʩ�ӵĸ������㣬��֮Ϊ�㷨
		//���ݽṹ�γ� ������Ч����ѧϰ�ߵı����ۺ�ʵ��
		
		//1  ����һ�����飬�����д�����ź���ĸ���
        String[] songs={"����ɽ�Ĺ���","���ò���","��֧ɽ�������","��һ������","�̵�Сҹ��",""};
        
        //���Ƚ�����ǰ�������ӡ��ʾ����
        System.out.println("�¸����ǰ:");
        for(int i=0;i<songs.length;i++){
        	System.out.print(songs[i]+"   ");
        }
        
        //Scanner  ����һ�׸裬
        Scanner input=new Scanner(System.in);
        
        System.out.println("\n������Ҫ����ĸ���:");
        String song=input.next(); 
        
        //position ��ʼλ���н�����������Ϊ0λ�� ,��Ӧ��Ϊ������������λ�� 
        int position=songs.length-1;
        
        //��������㷨�Ĳ���:
        //1  �ҵ�Ҫ�������в������ȷλ�� ������¼����
        for(int i=0;i<songs.length;i++){
        	//�ó�iλ�õĸ�������������ȣ��������ĸ� ����С����������͸ò��뵽iλ�� 
        	//���Ǽ�¼��iλ�ã���break
        	
        	//�ַ����Ĵ�С�Ƚϣ���������������������ֱ���ô�С�Ƚ�������� >   <   ==������
        	//����Ҫ��compare()��������.
        	
        	if(songs[i].compareTo(song)<0){
        		//����������������λ�þ���Ҫ�����λ�ã���֮��¼����
        		position=i;
        		break;
        	}
        }
        
        
        //ѭ �������� ������Σ� �ҵ���������Ͳ��뵽positionλ�� 
        //Ϊ��ʵ�ֲ��룬�����ٴι���һ��ѭ ��ȥ��������
       
        	//������������Σ�1  ���������λ�ò���  2 ���м�λ�ò���(�漰��˳����������Ԫ��)
            if(position==songs.length-1){
            	songs[position]=song;
            }else{
            	//˳���ƶ�����Ԫ�أ���Ҫ�����λ���ڳ���
            	//˳���ƶ�Ԫ�أ� ����Ҫ��ѭ����˳���ƶ�
            	for(int j=songs.length-2;j>=position;j--){
            		songs[j+1]=songs[j];
            	}
            	
            	songs[position]=song;
            }
        
       
        
        System.out.println("���������:");
        for(int i=0;i<songs.length;i++){
        	System.out.print(songs[i]+"   ");
        } 
	  
	}

}
