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
 * @author 北大青鸟 宠物商店实现类
 */
public class PetStoreServiceImpl implements PetStoreService {
	/**
	 * 为宠物定价
	 */
	public double charge(Pet pet) {
		// 编写定价规则
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
	 * 查询出所有库存宠物
	 */
	public List<Pet> getPetsInstock(long storeId) {
		PetDao petDao = new PetDaoImpl();
		// 当storeId不为0时，要执行查询所有库存宠物
		String sql = "select * from pet where owner_id is null and store_id=?";
		String[] param = { String.valueOf(storeId) };
		// 当storeId为0时，要执行查询库存id为storeId库存宠物
		if (0 == storeId) {
			sql = "select * from pet where owner_id is null";
			param = null;
		}

		List<Pet> petList = petDao.selectPet(sql, param);
		return petList;
	}

	/**
	 * 查询出所有新培育的宠物
	 */
	public List<Pet> getPetsBread() {
		PetDao petDao = new PetDaoImpl();
		String sql = "select * from pet where owner_id is null and typename not in (?,?)";
		String[] petParam = { "dog", "penguin" };
		List<Pet> petList = petDao.selectPet(sql, petParam);
		return petList;
	}

	/**
	 * 查询宠物商店账目
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
	 * 培育宠物
	 */
	public Pet bread(String petType) {
		Scanner input = new Scanner(System.in);
		System.out.println("请在下面输入宠物属性：");
		System.out.println("请输入宠物名字：");
		String petName = input.nextLine();
		System.out.println("请输入宠物健康指数（整数）：");
		String petHealth = input.nextLine();
		System.out.println("请输入宠物爱心指数（整数）：");
		String petLove = input.nextLine();
		System.out.println("请输入宠物所属宠物商店的标识符（整数）：");
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
			System.out.println("成功创建了一只" + pet.getTypeName() + "宠物");
		}
		return pet;
	}

	/**
	 * 购买宠物
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
		int updatePet = petStore.modifyPet(pet, null, store);// 更新宠物信息
		if (updatePet > 0) {// 更新宠物主人的信息
			int updateOwner = petStore.modifyOwner(owner, pet, 1);
			if (updateOwner > 0) {// 更新宠物商店的信息
				int updateStore = petStore.modifyStore(pet, 0);
				if (updateStore > 0) {// 更新宠物商店台帐信息
					int insertAccount = petStore.modifyAccount(pet, owner);
					if (insertAccount > 0) {
						System.out.println("台帐正确插入一条信息");
					}
				}
			}
		} else {
			System.out.println("修改宠物信息失败");
		}
	}

	/**
	 * 卖宠物
	 */
	public void sell(Pet pet) {
		PetDaoImpl petDao = new PetDaoImpl();
		PetStoreDaoImpl storeDao = new PetStoreDaoImpl();
		PetOwnerDaoImpl ownerDao = new PetOwnerDaoImpl();
		PetStoreService petStore = new PetStoreServiceImpl();
		String updatesql = "update pet set store_id = null ,owner_id=? where id=?";
		Object[] param = { pet.getOwnerId(), pet.getId() };
		int updatePet = petDao.executeSQL(updatesql, param);// 更新宠物信息
		if (updatePet > 0) {// 更新宠物主人的信息
			String ownersql = "select * from petowner where id=?";
			String ownerparam[] = { String.valueOf(pet.getOwnerId()) };

			PetOwner owner = ownerDao.selectOwner(ownersql, ownerparam);
			String updateOwnerSql = "update petowner set money=? where id=?";
			double count = petStore.charge(pet);
			Object[] ownerParam = { (owner.getMoney() - count), owner.getId() };
			int updateOwner = ownerDao.executeSQL(updateOwnerSql, ownerParam);
			if (updateOwner > 0) {// 更新宠物商店的信息
				PetStore store = petStore.getPetStore(pet.getStoreId());
				String updateStore = "update petstore set balance=? where id=?";
				Object[] storeParam = { (store.getBalance() + count),
						store.getId() };
				int updatestore = storeDao.executeSQL(updateStore, storeParam);
				if (updatestore > 0) {// 更新宠物商店台帐信息
					String insertsql = "insert into account values (?,?, ?, ?, ?, ?, TO_DATE(?,'yyyy-MM-dd'))";
					String date = new SimpleDateFormat("yyyy-MM-dd")
							.format(new Date());
					Object[] accountParam = { 2, 1, pet.getId(), owner.getId(),
							pet.getStoreId(), count, date };
					AccountDao accountDao = new AccountDaoImpl();
					int insertAccount = accountDao.updateAccount(insertsql,
							accountParam);
					if (insertAccount > 0) {
						System.out.println("台帐正确插入一条信息");
					}
				}
			}
		}
	}

	/**
	 * 根据宠物商店标识符查询宠物商店
	 */
	public PetStore getPetStore(long id) {
		String sql = "select * from petstore where id=" + id;
		PetStoreDao storeDao = new PetStoreDaoImpl();
		PetStore petStore = storeDao.getPetStore(sql, null);
		return petStore;
	}

	/**
	 * 根据宠物主人信息修改宠物信息 根据PetOwnerEntity和PetStoreEntity的值判断是宠物主人买宠物或者宠物商店买宠物
	 * PetOwnerEntity=null是宠物商店买宠物，PetStoreEntity=null是宠物主人买宠物
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
		int updatePet = petDao.executeSQL(updatesql, param);// 更新宠物信息
		return updatePet;
	}

	/**
	 * 修改宠物主人信息 type=0是宠物主人买宠物，type=1是宠物商店买宠物
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
	 * 修改宠物商店信息 type=0是宠物主人买宠物，type=1是宠物商店买宠物
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
	 * 修改宠物商店台帐信息
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
	 * 宠物商店登录
	 */
	public PetStore login() {
		Scanner input = new Scanner(System.in);
		PetStore petStore = null;
		// 1、输入宠物商店名字
		boolean type = true;
		while (type) {
			System.out.println("请先登陆，请输入宠物商店名字：");
			String storeName = input.nextLine();
			System.out.println("请输入宠物商店的密码：");
			String storePassword = input.nextLine();
			PetStoreDao storeDao = new PetStoreDaoImpl();
			String sql = "select * from petstore where name=? and password=?";
			String[] param = { storeName, storePassword };
			petStore = storeDao.getPetStore(sql, param);
			if (null != petStore) {
				System.out.println("-------恭喜成功登录-------");
				System.out.println("-------宠物商店的基本信息：-------");
				System.out.println("名字：" + petStore.getName());
				System.out.println("元宝数：" + petStore.getBalance());
				type = false;
			} else {
				System.out.println("登录失败，请确认您的用户名和密码是否正确,重新登录");
				type = true;
			}
		}
		return petStore;
	}

	@Override
	/**
	 * 查询出所有宠物主人正在出售的宠物
	 */
	public List<Pet> getPetSelling() {
		PetDao petDao = new PetDaoImpl();
		String sql = "select * from pet where owner_id is not null";
		String[] petParam = null;
		List<Pet> petList = petDao.selectPet(sql, petParam);
		return petList;
	}

}
