package com.lrc20180911inherit10;

public class Customer {

	
	public int caltotalRent(Vehicle[] vichles) {
		 int total=0;
		
		 for(Vehicle vichle:vichles) {
			 
			 total+=vichle.calRent(5);
		 }
		
		return total;
	}
	
	
}
