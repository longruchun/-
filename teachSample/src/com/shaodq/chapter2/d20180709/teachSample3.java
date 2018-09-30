package com.shaodq.chapter2.d20180709;

public class teachSample3 {

	public static void main(String[] args) {
		
		int money=3000;
		
		if(money>1000){
			if(money>5000){
				System.out.println("买个好键 盘");
			} else{
				System.out.println("买个鼠标");
			}
		}else{
			System.out.println("因为金额小于1000.根本不考虑购买任何物品");
		}
		
	}

}
