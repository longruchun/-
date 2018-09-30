package com.shaodq.chapter2.d20180730.parameterDemo;

import java.util.Scanner;

public class testCus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer customer=new Customer();
        
        Scanner input=new Scanner(System.in); 
        
        int count=0;
        
        while(count<customer.cus.length){
        	System.out.println("请输入顾客姓名:");
            String name =input.next();
            
            customer.add_cus(name);
            
            System.out.println("是否继续录入?(y OR n)");
            
            if("n".equals(input.next())){
            	break;
            }
        }
        
        customer.show();
        
        System.out.println("是否要对输入数组进行修改?(y OR n)");
        
        if("y".equals(input.next())){
        	System.out.println("请输入旧名字:");
        	String old=input.next();
        	
        	System.out.println("请输入新名字:");
        	String _new=input.next();
        	
        	customer.modify(old,_new);
        	
        }
        
        
        
	}

}
