package com.lrc20180915_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * ʹ��ArryList�洢�ʹ��������Ϣ��
 * @author ��������
 */
public class Test3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// 1���������������
		Penguin ououPenguin = new Penguin("ŷŷ", "Q��");
		Penguin yayaPenguin = new Penguin("����", "Q��");
		Penguin meimeiPenguin = new Penguin("����", "Q��");
		Penguin feifeiPenguin = new Penguin("�Ʒ�", "Q��");

		// 2������ArrayList���϶��󲢰Ѷ���������������
		List penList = new ArrayList();
		penList.add(ououPenguin);
		penList.add(yayaPenguin);
		penList.add(meimeiPenguin);
		penList.add(2, feifeiPenguin); // ���feifeiPenguin��ָ��λ��
		//3��ʹ��Iterator����ArrayList�е�Ԫ��
		System.out.println("ʹ��Iterator����ArrayList�е�Ԫ�أ�");
		Iterator iterator = penList.iterator();
		while(iterator.hasNext()){
			Penguin penguin = (Penguin)iterator.next();
			System.out.println(penguin.getName() + " " + penguin.getSex());
		}
		// 4������Linked���϶��󲢰Ѷ���������������
		LinkedList penLlist = new LinkedList();
		penLlist.add(ououPenguin);
		penLlist.addLast(yayaPenguin);
		penLlist.addFirst(meimeiPenguin);
		penLlist.add(feifeiPenguin); // ���feifeiPenguin��ָ��λ��
		//5��ʹ��Iterator����LinkedList�е�Ԫ��
		System.out.println("ʹ��Iterator����LinkedList�е�Ԫ�أ�");
		iterator = penLlist.iterator();
		while(iterator.hasNext()){
			Penguin penguin = (Penguin)iterator.next();
			System.out.println(penguin.getName() + " " + penguin.getSex());
		}
	}
	
}
