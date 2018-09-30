package com.lrc20180917_2;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		try {
			String s=null;
			s=s.toLowerCase();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("2");
		}finally{
			
			System.out.println("3");
			
		}
		
		System.out.println("4");
		
	}

}
