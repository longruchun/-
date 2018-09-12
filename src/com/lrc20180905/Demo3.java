package com.lrc20180905;

public class Demo3 {

	
	public int foo(int a,int b) {
		
		System.out.println(a+b);
		return a+b;
		
	}
	
public String  foo( String name) {
		name="lomn";
	    String str="我的名字是："+name;
	    System.out.println(str);
		return str;
		
	}
	
	
	
	
	
public String  foo( String name,int b) {
		
	    String str="我的名字是："+name;
	    System.out.println(str);
		return str;
		
	}
	
public long foo( long a,long b) {
	
	a=100;
	b=200;
	
	long result=a+b;
    System.out.println(a+b);
	return a+b;
	
	
}

public long foo( long b,int a) {
	
    System.out.println(a+b);
	return a+b;
	
	
	
}
	
public static void main(String[] args) {
	
	Demo3 de=new Demo3();
	de.foo(100, 100);
	de.foo("hello", 100);
	de.foo("long");
	de.foo(20,30);
}
	
}
