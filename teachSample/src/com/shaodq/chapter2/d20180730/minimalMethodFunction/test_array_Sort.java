package com.shaodq.chapter2.d20180730.minimalMethodFunction;

public class test_array_Sort {

	public static void main(String[] args) {
		//  TODO Auto-generated method stub
        Array_Sort a_s=new Array_Sort();
        
        int[] arr={12,58,33,7,90,120,88,19,95,6,18};
        
        System.out.println("����ǰ:");
        for(int i:arr){//ע�⣺foreachѭ ���У� i ��Ԫ��ֵ����������
        	System.out.print(i+" ");
        }
        
        a_s.sort(arr);
        
        System.out.println("\n�����:");
        for(int i:arr){//ע�⣺foreachѭ ���У� i ��Ԫ��ֵ����������
        	System.out.print(i+" ");
        }
	}

}
