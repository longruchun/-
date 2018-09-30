package com.shaodq.chapter2.d20180726;

public class Visitor {
    public String name ;
    public int age;
    
    public void buyTicket(){
    	System.out.println("姓名:"+name);
    	System.out.println("年龄:"+age);
    	System.out.println(age>=5?"门票：20元":"门票：免费");
    }
}
