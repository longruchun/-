package com.lrc20180915_2;

import java.util.HashMap;
import java.util.Map;




public class Test2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// 1�����������������
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		// 2������������������Map�У�ȡ�ǳ�Ϊ����
		Map dogs = new HashMap();
		dogs.put("ŷŷ", ououDog);
		dogs.put("����", yayaDog);
		dogs.put("����", meimeiDog);
		dogs.put("�Ʒ�", feifeiDog);

		// 3���ж�Map���Ƿ����ָ��key��ֵ����
		if (dogs.containsKey("ŷŷ")) {
			// 3.1������ڣ����ֵ������Ϣ
			Dog dog = (Dog) dogs.get("ŷŷ");
			System.out.println("Map�д���ָ�����󣬶�����Ϣ���£�");
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		} else {
			// 3.2����������ڣ����˵����Ϣ
			System.out.println("Map�в����ڸö���");
		}
	}
}
