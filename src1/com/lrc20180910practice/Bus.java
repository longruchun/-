package com.lrc20180910practice;


public final class Bus extends MotoVehicle {
	private int seatCount;// ×ùÎ»Êý
	public Bus() {
	}
	public Bus(String no, String brand, int seatCount) {
		super(no, brand);
		this.seatCount = seatCount;
	}
	
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	
	public int calRent(int days) {
		if (seatCount <= 16) {
			return days * 800;
		} else {
			return days * 1500;
		}
	}
}
