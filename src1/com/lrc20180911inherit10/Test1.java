package com.lrc20180911inherit10;

public class Test1 {
    public static void main(String[] args) {
		
    	Vehicle[] v=new Vehicle[4] ;
    	v[0]=new  Car("����");
    	v[1]=new  Car("�������");
    	v[2]=new  Car("���������");
    	v[3]=new Bus(34);
    	Customer c=new Customer();
    	System.out.println("�˿���������ܼ۸���"+c.caltotalRent(v));
    	
    	
	}

	
}
