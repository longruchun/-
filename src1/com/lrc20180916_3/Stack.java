package com.lrc20180916_3;

import  java.util.LinkedList;

public class Stack extends java.util.LinkedList {
	
	public void push(Object o) {
		
		this.addLast(o);
		
		
		
	}
	
	public Object _out() {
		
		
		
		
		return   this.removeLast();
		
		
		
	}
	
	
	

}
