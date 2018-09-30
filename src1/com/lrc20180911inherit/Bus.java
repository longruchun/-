package com.lrc20180911inherit;

public class Bus extends Car {
   //先执行父类的属性和构造方法,然后再执行
	public Bus(int site) {
		
		setSite(site);
		
	}
	
	
}
