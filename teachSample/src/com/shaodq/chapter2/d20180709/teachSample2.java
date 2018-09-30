package com.shaodq.chapter2.d20180709;

public class teachSample2 {

	public static void main(String[] args) {
		//如果20万以上---凯美瑞
		//如果16-20 ---丰田
		//12-16 --- 帕萨特
		//10-12 --- 桑塔拿
		//6-10 以下---QQ 电瓶车
		
		int money=170;
		
		/*if(money>=20){
			System.out.println("凯美瑞");
		}else if(money>=16&&money<20){
			System.out.println("丰田");
		}else if(money>=12&&money<16){
			System.out.println("帕萨特");
		}else if(money>=10&&money<12){
			System.out.println("桑塔拿");
		}else if(money>=6&&money<10){
			System.out.println("QQ 电瓶车");
		}else{
			System.out.println("暂时不购车");
		}*/
		
		/*if(money>=20){
			System.out.println("凯美瑞");
		}else if(money>=16){
			System.out.println("丰田");
		}else if(money>=12){
			System.out.println("帕萨特");
		}else if(money>=10){
			System.out.println("桑塔拿");
		}else if(money>=6){
			System.out.println("QQ 电瓶车");
		}else{
			System.out.println("暂时不购车");
		}*/
		
		
		if(money>=6){
			System.out.println("QQ 电瓶车");
		}else if(money>=10){
			System.out.println("桑塔拿");
		}else if(money>=12){
			System.out.println("帕萨特");
		}else if(money>=16){
			System.out.println("丰田");
		}else if(money>=20){
			System.out.println("凯美瑞");
		}else{
			System.out.println("暂时不购车");
		}
	
	}

}
