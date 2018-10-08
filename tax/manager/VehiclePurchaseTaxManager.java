package cn.jbit.tax.manager;


import java.util.Scanner;

import cn.jbit.tax.dao.VehiclePurchaseTaxDao;
import cn.jbit.tax.dao.impl.VehiclePurchaseTaxDaoOracleImpl;
import cn.jbit.tax.entity.VehiclePurchaseTax;

public class VehiclePurchaseTaxManager {
	/**
	 * 缴纳车辆购置税。
	 */
	public void payTax(){
		System.out.println("记录车辆购置税，请按提示录入相关信息：。");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入车主身份证号码(18位)：");
		String idCard=input.next();
		System.out.print("请输入车辆识别码(17位)：");
	    String identifier=input.next();
	    System.out.print("请输入车辆排量：");
	    double emissions=input.nextDouble();
	    System.out.print("请输入官方指导价：");
	    double guidePrice=input.nextDouble();
	    System.out.print("请输入发票价格：");
	    double invoicePrice=input.nextDouble();
	    VehiclePurchaseTax item=new VehiclePurchaseTax(idCard,identifier,emissions,guidePrice,invoicePrice);
	    VehiclePurchaseTaxDao vehiclePurchaseTaxDao=new VehiclePurchaseTaxDaoOracleImpl();
	    vehiclePurchaseTaxDao.save(item);
	    System.out.print("数据保存成功, 车辆购置税为"+Math.round(item.getPurchaseTax()));
	}
}
