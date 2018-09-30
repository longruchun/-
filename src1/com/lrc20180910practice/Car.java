package com.lrc20180910practice;


public final class Car extends MotoVehicle {
	private String type;// 汽车型号
	public Car() {
	}
	public Car(String no, String brand, String type) {
		super(no, brand);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int calRent(int days) {
		if ("1".equals(type)) {// 代表550i
			return days * 500;
		} else if ("2".equals(type)) {// 2代表商务舱GL8
			return 600 * days;
		} else {
			return 300 * days;
		}
	}
}
