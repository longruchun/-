package com.lrc20180915_1;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
  
	public static void main(String[] args) {
		//1ʹ��HashMAp�洢������ҵ�Ӣ�ļ��
		Map countries=new HashMap();
		countries.put("CN"," �л��������͹�");
		countries.put("RU","����˹" );
		countries.put("FR","����" );
		countries.put("US","����" );
		
		//2��ʾ"CN"��Ӧ���ҵ�Ӣ�ļ��
		String country=(String)countries.get("CN");
		System.out.println("CN��Ӧ�Ĺ�����:"+country);
		
		//3.��ʾ�����е�Ԫ�ظ���
		System.out.println("Map�й���"+countries.size()+"������");
		
		//4�����ж�MAP���Ƿ����"FR";
		System.out.println("MAp�а���FR��Key��?" +countries.containsKey("FR"));
		countries.remove("FR");
		System.out.println("MAp�а���FR��Key��?" +countries.containsKey("FR"));
		
		countries.keySet();
		countries.values();
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		
		System.out.println(countries);
		
		
		
		
	}
	
	
}
