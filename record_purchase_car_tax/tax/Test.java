package cn.jbit.tax;

import cn.jbit.tax.manager.VehiclePurchaseTaxManager;
/**
 * 测试类。
 * @author 北大青鸟
 */
public class Test {
	public static void main(String[] args) {	
		VehiclePurchaseTaxManager vehiclePurchaseTaxManager=new VehiclePurchaseTaxManager();		
		vehiclePurchaseTaxManager.payTax();
	}
}
