package com.lrc20180906;

public class Sample {
	private int x;
	public Sample(){
		x=1;
		
		
		
		
	}
	public void Sample(double f){
		
		this.x=(int)f;
		
		
	}
	
	public int getx(){
		
		
		return x;
	}
    
	public static void main(String[] args) {
		 Sample s=new  Sample();
		 System.out.println(s.getx());
		 
		 
		 
	}
	
	
}
