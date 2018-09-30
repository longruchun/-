package com.lrc20180911inherit4;

public class Test1 {
    public static void main(String[] args) {
		Car car=new Car();
		car.brand="别克商务车";
		car.calRent(3);
				
		System.out.println("租"+car.brand+"三天的费用是"+car.calRent(3)  	);
    	
    	
    	Bus bus=new Bus();
    	bus.seatcount=30;
    	System.out.println("租"+bus.seatcount+"座车三天的费用是"+bus.calRent(3));
    	
	}

	
}
