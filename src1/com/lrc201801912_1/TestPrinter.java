package com.lrc201801912_1;

public class TestPrinter {	
	public static void main(String[] args) {
		//������ʽ��ӡ�����󲢴�ӡ
		Printer dprinter=new DotMatrixPrinter();
		dprinter.print();
		//������ī��ӡ�����󲢴�ӡ
		Printer iprinter=new InkpetPrinter();
		iprinter.print();
		//���������ӡ�����󲢴�ӡ
//		Printer lprinter=new LaserPrinter();
//		lprinter.print();
	}
}
