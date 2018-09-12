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
	System.out.println(this.name+"销售了一辆"+"Excelle");
	
	 
	 
 } 
	
public void  sell( Regal   car) {
	System.out.println(this.name+"销售了一辆"+" Regal ");
	 
	 
	 
 } 	
	
public void sell( Excelle car,int num) {
	 
	System.out.println(this.name+"销售了"+num+"辆"+" Excelle ");
	 
	 
} 	
	
	
}
