package com.lrc20180910practice;


public final class Car extends MotoVehicle {
	private String type;// �����ͺ�
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
		if ("1".equals(type)) {// ����550i
			return days * 500;
		} else if ("2".equals(type)) {// 2���������GL8
			return 600 * days;
		} else {
			return 300 * days;
		}
	}
}
