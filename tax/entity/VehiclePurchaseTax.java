package cn.jbit.tax.entity;

import java.util.Date;


public class VehiclePurchaseTax implements java.io.Serializable {

	private static final long serialVersionUID = -5870970190753783148L;
	private String idCard; // 车主身份证号码
	private Date purcharseTime;// 购车日期
	private String identifier;// 车辆识别码
	private double emissions;//排量
	private double guidePrice;// 官方指导价
	private double invoicePrice;// 发票价格
	private double purchaseTax;// 缴纳车辆购置税金额
	public VehiclePurchaseTax() {
	}
	public VehiclePurchaseTax(String idCard, String identifier, double emissions, double guidePrice,
			double invoicePrice) {		
		this.idCard = idCard;
		this.identifier = identifier;
		this.emissions = emissions;
		this.guidePrice = guidePrice;
		this.invoicePrice = invoicePrice;
		if(emissions<=1.6)
			this.purchaseTax=invoicePrice/(1+0.17)*0.075;
		else
			this.purchaseTax=invoicePrice/(1+0.17)*0.1;
		
	}
	public double getEmissions() {
		return emissions;
	}
	public void setEmissions(double emissions) {
		this.emissions = emissions;
	}
	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getPurcharseTime() {
		return purcharseTime;
	}

	public void setPurcharseTime(Date purcharseTime) {
		this.purcharseTime = purcharseTime;
	}

	public double getGuidePrice() {
		return guidePrice;
	}

	public void setGuidePrice(double guidePrice) {
		this.guidePrice = guidePrice;
	}

	public double getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public double getPurchaseTax() {
		return purchaseTax;
	}

	public void setPurchaseTax(double purchaseTax) {
		this.purchaseTax = purchaseTax;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
