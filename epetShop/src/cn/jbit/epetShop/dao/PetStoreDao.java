package cn.jbit.epetShop.dao;

import java.util.List;

import cn.jbit.epetShop.entity.PetStore;

public interface PetStoreDao {

	/**
	 * ��ѯ�����г����̵�
	 */
	public abstract List<PetStore> getAllStore();

	/**
	 * ���ݲ�ѯ������ѯ�������̵�
	 */
	public abstract PetStore getPetStore(String sql, String[] param);

	/**
	 * ���³����̵���Ϣ
	 */
	public abstract int updateStore(String sql, Object[] param);

}