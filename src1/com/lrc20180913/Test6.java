package com.lrc20180913;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
		
    	try {
    		 Scanner input=new Scanner(System.in);
 			System.out.println("�����뱻����");
 			int num1=input.nextInt();
 			System.out.println("���������");
 			int num2=input.nextInt();
 			
 			System.out.println(String.format("%d/%d=%d", num1,num2,num1/num2));
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("���ִ��󱻳����ͳ�������������");
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��������Ϊ0");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("����δ֪�쳣");
		}finally {
			System.out.println("��л��ʹ�ñ�����");
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
