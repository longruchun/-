package p20180911_inherit_3;

public class Car extends Vichle {
   String brand;//Ʒ��:�����������յȵ�
   
   
	
   public Car(String brand) {
		super();
		this.brand = brand;
	}



/**
    * days---���˶�����
    */
	public double getCost(int days) {
		// TODO Auto-generated method stub
		double cost=0;
		if(brand.equals("��������GL8")) {
			cost=600*days;
		}else if(brand.equals("����550i")) {
			cost=500*days;
		}else if(brand.equals("���������")) {
			cost=300*days;
		}
		return cost;
	}

}
