package com.lrc20180910;

public class Seller {
  private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
 public void   sell(Excelle  car) {
	System.out.println(this.name+"������һ��"+"Excelle");
	
	 
	 
 } 
	
public void  sell( Regal   car) {
	System.out.println(this.name+"������һ��"+" Regal ");
	 
	 
	 
 } 	
	
public void sell( Excelle car,int num) {
	 
	System.out.println(this.name+"������"+num+"��"+" Excelle ");
	 
	 
} 	
	
	
}
