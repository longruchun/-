package com.lrc20180911inherit4;

public class Car extends Vehicle {
	String brand;

	
	public  int calRent(int days) {
		int cost = 0;

		if (brand.equals("�������")) {
			cost = 600*days;
		} else if (brand.equals("���������")) {
			cost = 300*days;
		} else if (brand.equals("����")) {
			cost = 500*days;
		}
        return   cost;
	}
             
}
