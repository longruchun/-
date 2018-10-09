/**
 * 
 */
package cn.jbit.epetShop.model.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import cn.jbit.epetShop.dao.AccountDao;
import cn.jbit.epetShop.dao.PetDao;
import cn.jbit.epetShop.dao.PetOwnerDao;
import cn.jbit.epetShop.dao.impl.AccountDaoImpl;
import cn.jbit.epetShop.dao.impl.PetDaoImpl;
import cn.jbit.epetShop.dao.impl.PetOwnerDaoImpl;
import cn.jbit.epetShop.dao.impl.PetStoreDaoImpl;
import cn.jbit.epetShop.entity.Pet;
import cn.jbit.epetShop.entity.PetOwner;
import cn.jbit.epetShop.entity.PetStore;
import cn.jbit.epetShop.model.PetOwnerService;
import cn.jbit.epetShop.model.PetStoreService;

/**
 * @author �������� ��������ʵ����
 */
public class PetOwnerServiceImpl implements PetOwnerService {

	/**
	 * �������˹�����������ҳ���õ�����ţ���ʵ�ʵ��ù����������߹����������ĳ���
	 */

	public void buy(Pet pet) {
		String sql = "select * from petowner where id=?";
		String param[] = { String.valueOf(pet.getOwnerId()) };
		PetOwnerDao ownerDao = new PetOwnerDaoImpl();
		PetOwner owner = ownerDao.selectOwner(sql, param);
		PetStoreService petStore = new PetStoreServiceImpl();
		int updatePet = petStore.modifyPet(pet, owner, null);// ���³�����Ϣ
		if (updatePet > 0) {// ���³������˵���Ϣ
			int updateOwner = petStore.modifyOwner(owner, pet, 0);
			if (updateOwner > 0) {// ���³����̵����Ϣ
				int updateStore = petStore.modifyStore(pet, 1);
				if (updateStore > 0) {// ���³����̵�̨����Ϣ
					int insertAccount = petStore.modifyAccount(pet, owner);
					if (insertAccount > 0) {
						System.out.println("̨����ȷ����һ����Ϣ");
					}
				}
			}
		}
	}

	/**
	 * ��������������̵������Լ�����
	 */
	public void sell(Pet pet) {
		PetDaoImpl petDao = new PetDaoImpl();
		PetOwnerDaoImpl ownerDao = new PetOwnerDaoImpl();
		String updatesql = "update pet set owner_id = null where id=?";
		Object[] param = { pet.getId() };
		int updatePet = petDao.executeSQL(updatesql, param);// ���³�����Ϣ
		if (updatePet > 0) {// ���³������˵���Ϣ
			String ownersql = "select * from petowner where id=?";
			String ownerparam[] = { String.valueOf(pet.getOwnerId()) };

			PetOwner owner = ownerDao.selectOwner(ownersql, ownerparam);
			String updateOwnerSql = "update petowner set money=? where id=?";
			Object[] ownerParam = { (owner.getMoney() + 3), owner.getId() };
			int updateOwner = ownerDao.executeSQL(updateOwnerSql, ownerParam);
			if (updateOwner > 0) {// ���³����̵����Ϣ
				PetStoreServiceImpl store = new PetStoreServiceImpl();
				PetStore petStore = store.getPetStore(pet.getStoreId());
				String updateStore = "update petstore set balance=? where id=?";
				Object[] storeParam = { (petStore.getBalance() - 3),
						petStore.getId() };
				PetStoreDaoImpl storeDao = new PetStoreDaoImpl();
				int updatestore = storeDao.executeSQL(updateStore, storeParam);
				if (updatestore > 0) {// ���³����̵�̨����Ϣ
					String insertsql = "insert into account values (?,?, ?, ?, ?, ?, TO_DATE(?,'yyyy-MM-dd'))";
					String date = new SimpleDateFormat("yyyy-MM-dd")
							.format(new Date());
					Object[] accountParam = { 2, 2, pet.getId(), owner.getId(),
							pet.getStoreId(), 3, date };
					AccountDao accountDao = new AccountDaoImpl();
					int insertAccount = accountDao.updateAccount(insertsql,
							accountParam);
					if (insertAccount > 0) {
						System.out.println("̨����ȷ����һ����Ϣ");
					}
				}
			}
		}
	}

	/**
	 * �������˵�¼
	 */
	public PetOwner login() {
		Scanner input = new Scanner(System.in);
		// 1��������������
		System.out.println("���ȵ�½�������������˵����֣�");
		String ownerName = input.nextLine();
		System.out.println("�����������˵����룺");
		String ownerPassword = input.nextLine();
		PetOwnerDao ownerDao = new PetOwnerDaoImpl();
		String sql = "select * from petowner where name=? and password=?";
		String[] param = { ownerName, ownerPassword };
		PetOwner owner = ownerDao.selectOwner(sql, param);
		if (null != owner) {
			System.out.println("-------��ϲ���ɹ���¼-------");
			System.out.println("-------���Ļ�����Ϣ��-------");
			System.out.println("���֣�" + owner.getName());
			System.out.println("Ԫ������" + owner.getMoney());
		}
		return owner;
	}

	/**
	 * 
	 * ���ݳ������˱�ʶ����id����õ��ó����������г�����Ϣ
	 */
	public List<Pet> getMyPet(int ownerId) {
		List<Pet> petList = new ArrayList<Pet>();
		String sql = "select * from pet where owner_id=?";
		String[] param = { String.valueOf(ownerId) };
		PetDao petDao = new PetDaoImpl();
		petList = petDao.selectPet(sql, param);
		return petList;
	}

}