package com.lrc20180911inherit;

public class Car {
private int site=4;
  public Car() {
	  
	  System.out.println("�ؿ�����"+this.getSite()+"��");
  }
public void setSite(int site) {
	this.site = site;
}
	
	public void print() {
		
		System.out.println("�ؿ�����"+this.getSite()+"��");
		
	}
	public int getSite() {
		return site;
	}
	
}
