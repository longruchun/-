package com.lrc20180906;

public class demo2 {

public double result(double d1,double d2){
		
		return d1<d2?d1:d2;
		
		
	}

	
public double result(int d1,double d2){
		
		return d1<d2?d1:d2;
		
		
	}

public double result(int i){
	
	return i;
	
	
}

public int result(int d1,int d2){
	
	return d1-d2;
	
	
}

public static void main(String[] args) {
	demo2 d=new demo2();
	System.out.println(d.result(2, 3.0)+"");
	System.out.println(d.result(4.0, 4.5)+"");
	System.out.println(d.result(10, 9)+"");
}	
}
