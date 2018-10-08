/**
 * 
 */
package cn.jbit.epetShop.model;

import java.util.List;

import cn.jbit.epetShop.entity.Account;
import cn.jbit.epetShop.entity.Pet;
import cn.jbit.epetShop.entity.PetOwner;


public interface Accountable {
	
	public List<Account> account(long storeId);

	/**
	 * �޸ĳ����̵�̨����Ϣ
	 */
	public int modifyAccount(Pet pet, PetOwner owner);

}
