package com.lrc20180911inherit10;

public class Test1 {
    public static void main(String[] args) {
		
    	Vehicle[] v=new Vehicle[4] ;
    	v[0]=new  Car("宝马");
    	v[1]=new  Car("别克商务");
    	v[2]=new  Car("别克林荫大道");
    	v[3]=new Bus(34);
    	Customer c=new Customer();
    	System.out.println("顾客租五天的总价格是"+c.caltotalRent(v));
    	
    	
	}

	
}
