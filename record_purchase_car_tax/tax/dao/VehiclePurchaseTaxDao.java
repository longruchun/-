package cn.jbit.tax.dao;

import cn.jbit.tax.entity.VehiclePurchaseTax;
/**
 * 车辆购置税DAO接口。
 * @author 北大青鸟
 */
public interface VehiclePurchaseTaxDao {
	/**
	 * 保存车辆购置税。
	 * @param item  车辆购置税对象
	 */
	void save(VehiclePurchaseTax item);
}
