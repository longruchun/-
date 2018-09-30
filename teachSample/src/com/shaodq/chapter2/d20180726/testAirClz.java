package com.shaodq.chapter2.d20180726;

public class testAirClz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//根据类作为模板，创建 类的一个实例对象， 我们称之为实例 化
        AirCondition air=new AirCondition();//铺例 化一个对象
        
        //为对象的相关属性赋值       
        /*air.grand="Hicher";
        air.color="white";
        air.power="3匹";
        air._type="嵌入式";*/
        
        //调用对象的方法，显示对象的信息
        air.show();
	}

}
