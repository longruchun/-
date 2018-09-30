package com.lrc20180911inherit10;

public class Car extends Vehicle {
	String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public int calRent(int days) {
		int cost = 0;

		if (brand.equals("别克商务")) {
			cost = 600 * days;
		} else if (brand.equals("别克林荫大道")) {
			cost = 300 * days;
		} else if (brand.equals("宝马")) {
			cost = 500 * days;
		}
		return cost;
	}

}
