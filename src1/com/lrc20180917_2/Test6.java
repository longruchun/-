package com.lrc20180917_2;

public class Test6 {
   public static void main(String[] args) {
	 
	 /*  try {
		   int i=0;
		 if (i==1) {
			throw new Exception();
			
		}
		 System.out.println("1");
	} catch (Exception e) {
		 System.out.println("2");
	}finally {
		 System.out.println("3");
		
	}
	   
	   System.out.println("4");  
	   
	   
	   */
	   
	   
	   
	   try {
		  int[] arrayRefVar = new int[5];
		  
		  for (int i = 0; i < arrayRefVar.length; i++) {
			System.out.println(i);
		}
		   
		   
		   
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	   
	   
}
}
