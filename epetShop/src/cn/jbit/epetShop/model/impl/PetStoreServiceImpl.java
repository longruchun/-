/**
 * 
 */
package cn.jbit.epetShop.model.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import cn.jbit.epetShop.dao.AccountDao;
import cn.jbit.epetShop.dao.PetDao;
import cn.jbit.epetShop.dao.PetOwnerDao;
import cn.jbit.epetShop.dao.PetStoreDao;
import cn.jbit.epetShop.dao.impl.AccountDaoImpl;
import cn.jbit.epetShop.dao.impl.PetDaoImpl;
import cn.jbit.epetShop.dao.impl.PetOwnerDaoImpl;
import cn.jbit.epetShop.dao.impl.PetStoreDaoImpl;
import cn.jbit.epetShop.entity.Account;
import cn.jbit.epetShop.entity.Pet;
import cn.jbit.epetShop.entity.PetOwner;
import cn.jbit.epetShop.entity.PetStore;
import cn.jbit.epetShop.model.PetFactory;
import cn.jbit.epetShop.model.PetStoreService;

/**
 * @author �������� �����̵�ʵ����
 */
public class PetStoreServiceImpl implements PetStoreService {
	/**
	 * Ϊ���ﶨ��
	 */
	public double charge(Pet pet) {
		// ��д���۹���
		Date date = new Date();
		double price = 0;
		int age = date.getYear() - pet.getBirthdate().getYear();
		if (age > 5) {
			price = 3;
		} else {
			price = 5;
		}
		return price;
	}

	/**
	 * ��ѯ�����п�����
	 */
	public List<Pet> getPetsInstock(long storeId) {
		PetDao petDao = new PetDaoImpl();
		// ��storeId��Ϊ0ʱ��Ҫִ�в�ѯ���п�����
		String sql = "select * from pet where owner_id is null and store_id=?";
		String[] param = { String.valueOf(storeId) };
		// ��storeIdΪ0ʱ��Ҫִ�в�ѯ���idΪstoreId������
		if (0 == storeId) {
			sql = "select * from pet where owner_id is null";
			param = null;
		}

		List<Pet> petList = petDao.selectPet(sql, param);
		return petList;
	}

	/**
	 * ��ѯ�������������ĳ���
	 */
	public List<Pet> getPetsBread() {
		PetDao petDao = new PetDaoImpl();
		String sql = "select * from pet where owner_id is null and typename not in (?,?)";
		String[] petParam = { "dog", "penguin" };
		List<Pet> petList = petDao.selectPet(sql, petParam);
		return petList;
	}

	/**
	 * ��ѯ�����̵���Ŀ
	 */
	public List<Account> account(long storeId) {
		String sql = "select * from account where deal_type=? and seller_id=? union select * from account where deal_type=? and buyer_id=?";
		String[] param = { "1", String.valueOf(storeId), "2",
				String.valueOf(storeId) };
		AccountDao accountDao = new AccountDaoImpl();
		List<Account> list = accountDao.getPetStoreAccount(sql, param);
		return list;
	}

	/**
	 * ��������
	 */
	public Pet bread(String petType) {
		Scanner input = new Scanner(System.in);
		System.out.println("������������������ԣ�");
		System.out.println("������������֣�");
		String petName = input.nextLine();
		System.out.println("��������｡��ָ������������");
		String petHealth = input.nextLine();
		System.out.println("��������ﰮ��ָ������������");
		String petLove = input.nextLine();
		System.out.println("������������������̵�ı�ʶ������������");
		String StoreId = input.nextLine();
		String[] petParam = { petName, petType, petHealth, petLove, StoreId };
		PetFactory petFactory = new PetFactoryImpl();
		Pet pet = petFactory.breadNewPet(petParam);
		String ownerId = "";
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		String petBirthday = simpleDate.format(new Date());
		String sql = "insert into pet values(?,?,?,?,?,TO_DATE(?,'yyyy-MM-dd'),?,?)";

		Object[] param = { 2, pet.getName(), pet.getTypeName(),
				pet.getHealth(), pet.getLove(), petBirthday, ownerId,
				pet.getStoreId() };
		PetDao petDao = new PetDaoImpl();
		int count = petDao.updatePet(sql, param);
		if (count > 0) {
			System.out.println("�ɹ�������һֻ" + pet.getTypeName() + "����");
		}
		return pet;
	}

	/**
	 * �������
	 */
	public void buy(Pet pet) {
		String sql = "select * from petStore where id=?";
		String paramStore[] = { String.valueOf(pet.getStoreId()) };
		PetStoreDao storeDao = new PetStoreDaoImpl();
		PetStore store = storeDao.getPetStore(sql, paramStore);
		PetStoreService petStore = new PetStoreServiceImpl();
		String paramOwner[] = { String.valueOf(pet.getOwnerId()) };
		PetOwnerDao ownerDao = new PetOwnerDaoImpl();
		PetOwner owner = ownerDao.selectOwner(sql, paramOwner);
		int updatePet = petStore.modifyPet(pet, null, store);// ���³�����Ϣ
		if (updatePet > 0) {// ���³������˵���Ϣ
			int updateOwner = petStore.modifyOwner(owner, pet, 1);
			if (updateOwner > 0) {// ���³����̵����Ϣ
				int updateStore = petStore.modifyStore(pet, 0);
				if (updateStore > 0) {// ���³����̵�̨����Ϣ
					int insertAccount = petStore.modifyAccount(pet, owner);
					if (insertAccount > 0) {
						System.out.println("̨����ȷ����һ����Ϣ");
					}
				}
			}
		} else {
			System.out.println("�޸ĳ�����Ϣʧ��");
		}
	}

	/**
	 * ������
	 */
	public void sell(Pet pet) {
		PetDaoImpl petDao = new PetDaoImpl();
		PetStoreDaoImpl storeDao = new PetStoreDaoImpl();
		PetOwnerDaoImpl ownerDao = new PetOwnerDaoImpl();
		PetStoreService petStore = new PetStoreServiceImpl();
		String updatesql = "update pet set store_id = null ,owner_id=? where id=?";
		Object[] param = { pet.getOwnerId(), pet.getId() };
		int updatePet = petDao.executeSQL(updatesql, param);// ���³�����Ϣ
		if (updatePet > 0) {// ���³������˵���Ϣ
			String ownersql = "select * from petowner where id=?";
			String ownerparam[] = { String.valueOf(pet.getOwnerId()) };

			PetOwner owner = ownerDao.selectOwner(ownersql, ownerparam);
			String updateOwnerSql = "update petowner set money=? where id=?";
			double count = petStore.charge(pet);
			Object[] ownerParam = { (owner.getMoney() - count), owner.getId() };
			int updateOwner = ownerDao.executeSQL(updateOwnerSql, ownerParam);
			if (updateOwner > 0) {// ���³����̵����Ϣ
				PetStore store = petStore.getPetStore(pet.getStoreId());
				String updateStore = "update petstore set balance=? where id=?";
				Object[] storeParam = { (store.getBalance() + count),
						store.getId() };
				int updatestore = storeDao.executeSQL(updateStore, storeParam);
				if (updatestore > 0) {// ���³����̵�̨����Ϣ
					String insertsql = "insert into account values (?,?, ?, ?, ?, ?, TO_DATE(?,'yyyy-MM-dd'))";
					String date = new SimpleDateFormat("yyyy-MM-dd")
							.format(new Date());
					Object[] accountParam = { 2, 1, pet.getId(), owner.getId(),
							pet.getStoreId(), count, date };
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
	 * ���ݳ����̵��ʶ����ѯ�����̵�
	 */
	public PetStore getPetStore(long id) {
		String sql = "select * from petstore where id=" + id;
		PetStoreDao storeDao = new PetStoreDaoImpl();
		PetStore petStore = storeDao.getPetStore(sql, null);
		return petStore;
	}

	/**
	 * ���ݳ���������Ϣ�޸ĳ�����Ϣ ����PetOwnerEntity��PetStoreEntity��ֵ�ж��ǳ��������������߳����̵������
	 * PetOwnerEntity=null�ǳ����̵�����PetStoreEntity=null�ǳ������������
	 */
	public int modifyPet(Pet pet, PetOwner owner,
			PetStore store) {
		String updatesql = null;
		long id = 0;
		if (null == store) {
			updatesql = "update pet set owner_id=? where id=?";
			id = owner.getId();
		} else if (null == owner) {
			updatesql = "update pet set store_id=?,owner_id=null where id=?";
			id = store.getId();
		}
		Object[] param = { id, pet.getId() };
		PetDaoImpl petDao = new PetDaoImpl();
		int updatePet = petDao.executeSQL(updatesql, param);// ���³�����Ϣ
		return updatePet;
	}

	/**
	 * �޸ĳ���������Ϣ type=0�ǳ�����������type=1�ǳ����̵������
	 */
	public int modifyOwner(PetOwner owner, Pet pet, int type) {
		PetOwnerDaoImpl ownerDao = new PetOwnerDaoImpl();
		String updateOwnerSql = "update petowner set money=? where id=?";
		double price = this.charge(pet);
		double count = 0;
		if (0 == type) {
			count = (owner.getMoney() - price);
		}
		if (1 == type) {
			count = (owner.getMoney() + price);
		}
		Object[] ownerParam = { count, owner.getId() };
		int updateOwner = ownerDao.executeSQL(updateOwnerSql, ownerParam);
		return updateOwner;
	}

	/**
	 * �޸ĳ����̵���Ϣ type=0�ǳ�����������type=1�ǳ����̵������
	 */
	public int modifyStore(Pet pet, int type) {
		PetStoreService store = new PetStoreServiceImpl();
		PetStore petStore = store.getPetStore(pet.getStoreId());
		String updateStore = "update petstore set balance=? where id=?";
		double price = this.charge(pet);
		double count = 0;
		if (0 == type) {
			count = (petStore.getBalance() - price);
		}
		if (1 == type) {
			count = (petStore.getBalance() + price);
		}
		Object[] storeParam = { count, petStore.getId() };
		PetStoreDaoImpl storeDao = new PetStoreDaoImpl();
		int updatestore = storeDao.executeSQL(updateStore, storeParam);
		return updatestore;
	}

	/**
	 * �޸ĳ����̵�̨����Ϣ
	 */
	public int modifyAccount(Pet pet, PetOwner owner) {
		String insertsql = "insert into account values (?,?, ?, ?, ?, ?, TO_DATE(?,'yyyy-MM-dd'))";
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		double price = this.charge(pet);
		Object[] accountParam = { 2, 1, pet.getId(), owner.getId(),
				pet.getStoreId(), price, date };
		AccountDao accountDao = new AccountDaoImpl();
		int insertAccount = accountDao.updateAccount(insertsql, accountParam);
		return insertAccount;
	}

	/**
	 * �����̵��¼
	 */
	public PetStore login() {
		Scanner input = new Scanner(System.in);
		PetStore petStore = null;
		// 1����������̵�����
		boolean type = true;
		while (type) {
			System.out.println("���ȵ�½������������̵����֣�");
			String storeName = input.nextLine();
			System.out.println("����������̵�����룺");
			String storePassword = input.nextLine();
			PetStoreDao storeDao = new PetStoreDaoImpl();
			String sql = "select * from petstore where name=? and password=?";
			String[] param = { storeName, storePassword };
			petStore = storeDao.getPetStore(sql, param);
			if (null != petStore) {
				System.out.println("-------��ϲ�ɹ���¼-------");
				System.out.println("-------�����̵�Ļ�����Ϣ��-------");
				System.out.println("���֣�" + petStore.getName());
				System.out.println("Ԫ������" + petStore.getBalance());
				type = false;
			} else {
				System.out.println("��¼ʧ�ܣ���ȷ�������û����������Ƿ���ȷ,���µ�¼");
				type = true;
			}
		}
		return petStore;
	}

	@Override
	/**
	 * ��ѯ�����г����������ڳ��۵ĳ���
	 */
	public List<Pet> getPetSelling() {
		PetDao petDao = new PetDaoImpl();
		String sql = "select * from pet where owner_id is not null";
		String[] petParam = null;
		List<Pet> petList = petDao.selectPet(sql, petParam);
		return petList;
	}

}