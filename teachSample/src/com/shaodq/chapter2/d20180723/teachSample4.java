package com.shaodq.chapter2.d20180723;

import java.util.Arrays;


/**
 * ����Ĺ�����ʾ�˻����������ͱ�����ֵ
 * �������������͸�ֵ�Ĳ�ͬ�ص�
 * ��ʾ�˻��������������ݡ����������������ڴ�����ϵĲ�ͬ�ص�
 */
public class teachSample4 {

	/**
	 * 
	 * @param args---����main��ڷ����Ĳ���
	 * main������ һ��java��ִ�е���ʼ��
	 */
	public static void main(String[] args) {
		int[] Zhang={170,69};
		//int[] Li=Zhang;//Bug����������һ���﷨��
		//��ע�͵������丳ֵ�ǲ��еģ��﷨û���󣬵�����������ĵ�ַ
		
		//int[] Li={Zhang[0],Zhang[1]};//��ȷ�﷨֮һ
		
		
		
		
		/*int[] Li=new int[2];
		
		Li[0]=Zhang[0];
		Li[1]=Zhang[1];
		
		System.out.println("ȥ��---�ŵ���ߡ�����:"+Zhang[0]+" "+Zhang[1]);
		System.out.println("ȥ��---�����ߡ�����:"+Li[0]+" "+Li[1]);
		
		Li[0]=180;
		Li[1]=70;
		
		System.out.println("����---�ŵ���ߡ�����:"+Zhang[0]+" "+Zhang[1]);
		System.out.println("����---�����ߡ�����:"+Li[0]+" "+Li[1]);*/
		
		//������������������������if...else �ṹ
		int num=100;
		
		/*if(num>=100){
			System.out.println("����num��ֵ�Ǵ��ڻ����100��");
		}else{
			System.out.println("����num��ֵ��С��100��");
		}*/
		
		//��Ԫ�����---��Ϊ��������������,��java��Ψһһ����Ԫ�����
		//express1?express2:express3
		System.out.println((num>=100)?"����num��ֵ�Ǵ��ڻ����100��":"����num��ֵ��С��100��");
		
		
	}

}
