package com.shaodq.chapter2.d20180726;

public class Visitor {
    public String name ;
    public int age;
    
    public void buyTicket(){
    	System.out.println("����:"+name);
    	System.out.println("����:"+age);
    	System.out.println(age>=5?"��Ʊ��20Ԫ":"��Ʊ�����");
    }
}
