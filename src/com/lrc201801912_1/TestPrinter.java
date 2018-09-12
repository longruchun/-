package com.lrc201801912_1;

public class TestPrinter {	
	public static void main(String[] args) {
		//创建针式打印机对象并打印
		Printer dprinter=new DotMatrixPrinter();
		dprinter.print();
		//创建喷墨打印机对象并打印
		Printer iprinter=new InkpetPrinter();
		iprinter.print();
		//创建激光打印机对象并打印
//		Printer lprinter=new LaserPrinter();
//		lprinter.print();
	}
}
