package com.lrc20180915_1;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
  
	public static void main(String[] args) {
		//1使用HashMAp存储多个国家的英文简称
		Map countries=new HashMap();
		countries.put("CN"," 中华人名共和国");
		countries.put("RU","俄罗斯" );
		countries.put("FR","法国" );
		countries.put("US","美国" );
		
		//2显示"CN"对应国家的英文简称
		String country=(String)countries.get("CN");
		System.out.println("CN对应的国家是:"+country);
		
		//3.显示集合中的元素个数
		System.out.println("Map中共有"+countries.size()+"组数据");
		
		//4两次判断MAP中是否存在"FR";
		System.out.println("MAp中包含FR的Key吗?" +countries.containsKey("FR"));
		countries.remove("FR");
		System.out.println("MAp中包含FR的Key吗?" +countries.containsKey("FR"));
		
		countries.keySet();
		countries.values();
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		
		System.out.println(countries);
		
		
		
		
	}
	
	
}
