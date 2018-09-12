/**
 * 
 */
package com.lrc20180911inherit10;

/**
 * @author Administrator
 *
 */
public class Bus extends Vehicle {
    int seatcount=0;
	
    
	public Bus(int seatcount) {
		super();
		this.seatcount = seatcount;
	}


	

	public int calRent(int days) {
		// TODO Auto-generated method stub
          int cost=0;  
		
		if (seatcount>16) {
			
			cost=1500*days;
		} else {
			cost=800*days;
		}
		
		return cost;
	}

}
