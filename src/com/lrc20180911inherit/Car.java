package com.lrc20180911inherit;

public class Car {
private int site=4;
  public Car() {
	  
	  System.out.println("载客量是"+this.getSite()+"人");
  }
public void setSite(int site) {
	this.site = site;
}
	
	public void print() {
		
		System.out.println("载客量是"+this.getSite()+"人");
		
	}
	public int getSite() {
		return site;
	}
	
}
