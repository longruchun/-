package cn.jbit.tax.manager;


import java.util.Scanner;

import cn.jbit.tax.dao.VehiclePurchaseTaxDao;
import cn.jbit.tax.dao.impl.VehiclePurchaseTaxDaoOracleImpl;
import cn.jbit.tax.entity.VehiclePurchaseTax;

public class VehiclePurchaseTaxManager {
	/**
	 * ���ɳ�������˰��
	 */
	public void payTax(){
		System.out.println("��¼��������˰���밴��ʾ¼�������Ϣ����");
		Scanner input = new Scanner(System.in);
		System.out.print("�����복�����֤����(18λ)��");
		String idCard=input.next();
		System.out.print("�����복��ʶ����(17λ)��");
	    String identifier=input.next();
	    System.out.print("�����복��������");
	    double emissions=input.nextDouble();
	    System.out.print("������ٷ�ָ���ۣ�");
	    double guidePrice=input.nextDouble();
	    System.out.print("�����뷢Ʊ�۸�");
	    double invoicePrice=input.nextDouble();
	    VehiclePurchaseTax item=new VehiclePurchaseTax(idCard,identifier,emissions,guidePrice,invoicePrice);
	    VehiclePurchaseTaxDao vehiclePurchaseTaxDao=new VehiclePurchaseTaxDaoOracleImpl();
	    vehiclePurchaseTaxDao.save(item);
	    System.out.print("���ݱ���ɹ�, ��������˰Ϊ"+Math.round(item.getPurchaseTax()));
	}
}
