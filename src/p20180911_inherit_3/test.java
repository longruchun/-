package p20180911_inherit_3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Car car=new Car();
        car.brand="别克商务舱GL8";
        
        System.out.println("租用 "+car.brand+" 3天的费用是:"+car.getCost(3));*/
        
        Vichle[] vichles=new Vichle[4];
        
        Vichle vichle=new Car("宝马550i");
        vichles[0]=vichle;
        
        Vichle vichle1=new Car("宝马550i");
        vichles[1]=vichle1;
        
        Vichle vichle2=new Bus(34);
        vichles[2]=vichle2;
        
        Vichle vichle3=new Car("别克商务舱GL8");
        vichles[3]=vichle3;
        
        customer cus=new customer();
        System.out.println("客户租用的总租金是:"+cus.CountTotal(vichles));
        
	}

}
