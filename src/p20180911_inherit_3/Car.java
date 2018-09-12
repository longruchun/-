package p20180911_inherit_3;

public class Car extends Vichle {
   String brand;//品牌:宝马，别克商务舱等等
   
   
	
   public Car(String brand) {
		super();
		this.brand = brand;
	}



/**
    * days---租了多少天
    */
	public double getCost(int days) {
		// TODO Auto-generated method stub
		double cost=0;
		if(brand.equals("别克商务舱GL8")) {
			cost=600*days;
		}else if(brand.equals("宝马550i")) {
			cost=500*days;
		}else if(brand.equals("别克林荫大道")) {
			cost=300*days;
		}
		return cost;
	}

}
