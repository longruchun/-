package com.lrc20180910practice;

/**
 * ���������ࡣ
 * @author ��������
 */
public abstract class MotoVehicle {
	private String no;// �����ƺ�
	private String brand;// ����Ʒ��
	/**
	 * �޲ι��췽����
	 */
	public MotoVehicle() {
	}
	/**
	 * �вι��췽����
	 * @param no  �����ƺ�
	 * @param brand  ����Ʒ��
	 */
	public MotoVehicle(String no, String brand) {
		this.no = no;
		this.brand = brand;
	}
	public String getNo() {
		return no;
	}
	public String getBrand() {
		return brand;
	}
	/**
	 * ���󷽷��������������޼ۡ�
	 * */
	public abstract int calRent(int days);

}
