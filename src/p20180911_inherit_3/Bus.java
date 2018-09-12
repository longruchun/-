/**
 * 
 */
package p20180911_inherit_3;

/**
 * @author Administrator
 *
 */
public class Bus extends Vichle {

	int seats;//×ùÎ»Êı
	
	
	
	public Bus(int seats) {
		super();
		this.seats = seats;
	}



	@Override
	public double getCost(int days) {
		// TODO Auto-generated method stub
		double cost=0;
		if(seats<16) {
			cost=800*days;
		}else if(seats>=16) {
			cost=1500*days;
		}
		return cost;
	}

}
