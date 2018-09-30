package p20180911_inherit_3;

public class customer {
    public double CountTotal(Vichle[]  vichles) {
    	double total=0;
    	
    	for(Vichle vichle : vichles) {
    		total+=vichle.getCost(5);
    	}
    	
    	return total;
    }
}
