package com.lrc20180911inherit4;

public class Test1 {
    public static void main(String[] args) {
		Car car=new Car();
		car.brand="�������";
		car.calRent(3);
				
		System.out.println("��"+car.brand+"����ķ�����"+car.calRent(3)  	);
    	
    	
    	Bus bus=new Bus();
    	bus.seatcount=30;
    	System.out.println("��"+bus.seatcount+"��������ķ�����"+bus.calRent(3));
    	
	}

	
}
