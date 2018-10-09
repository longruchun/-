/**
 * 
 */
package cn.jbit.epetShop.model.impl;

import java.util.Scanner;

import cn.jbit.epetShop.dao.PetStoreDao;
import cn.jbit.epetShop.dao.impl.PetStoreDaoImpl;
import cn.jbit.epetShop.model.PetStoreFactory;

/**
 * @author �������� �����̵깤��ʵ����
 */
public class PetStoreFactoryImpl implements PetStoreFactory {

	/**
	 * ���������̵�
	 */
	public void createPetStore() {
		Scanner input = new Scanner(System.in);
		System.out.println("����������������̵����ԣ�");
		System.out.println("����������̵����֣�");
		String storeName = input.nextLine();
		System.out.println("����������̵�����루Ӣ�ļ����֣���");
		String storePassword = input.nextLine();
		System.out.println("����������̵���ʽ���������");
		String petBalance = input.nextLine();
		String sql = "insert into petstore values(?,?,?,?)";
		Object[] param = { 2, storeName, storePassword, petBalance };
		PetStoreDao storeDao = new PetStoreDaoImpl();
		int count = storeDao.updateStore(sql, param);
		if (count > 0) {
			System.out.println("�ɹ�������һ�������̵꣬�̵����ֽ�" + storeName);
		}
	}

}