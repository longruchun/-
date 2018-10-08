/**
 * 
 */
package cn.jbit.epetShop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.jbit.epetShop.dao.BaseDao;
import cn.jbit.epetShop.dao.PetDao;
import cn.jbit.epetShop.entity.Pet;

/**
 * @author 北大青鸟 宠物数据库操作类
 */
public class PetDaoImpl extends BaseDao implements PetDao {
	private Connection conn = null; // 保存数据库连接

	private PreparedStatement pstmt = null; // 用于执行SQL语句

	private ResultSet rs = null; // 用户保存查询结果集

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetDao#getAllPet()
	 */
	public List<Pet> getAllPet() {
		List<Pet> petList = new ArrayList<Pet>();
		String preparedSql = "select * from pet ";
		rs = super.executeQuerySQL(preparedSql, null);
		try {
			while (rs.next()) {

				Pet pet = new Pet();
				pet.setId(rs.getInt(1));
				pet.setName(rs.getString(2));
				pet.setTypeName(rs.getString(3));
				pet.setHealth(rs.getInt(4));
				pet.setLove(rs.getInt(5));
				pet.setBirthdate(rs.getDate(6));
				pet.setOwnerId(rs.getInt(7));
				pet.setStoreId(rs.getInt(8));
				petList.add(pet);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return petList;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetDao#selectPet(java.lang.String, java.lang.String[])
	 */
	public List<Pet> selectPet(String sql, String[] param) {
		List<Pet> petList = new ArrayList<Pet>();
		rs = super.executeQuerySQL(sql, param);
		try {
			while (rs.next()) {
				Pet pet = new Pet();
				pet.setId(rs.getInt(1));
				pet.setName(rs.getString(2));
				pet.setTypeName(rs.getString(3));
				pet.setHealth(rs.getInt(4));
				pet.setLove(rs.getInt(5));
				pet.setBirthdate(rs.getDate(6));
				pet.setOwnerId(rs.getInt(7));
				pet.setStoreId(rs.getInt(8));
				petList.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return petList;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetDao#updatePet(java.lang.String, java.lang.Object[])
	 */
	public int updatePet(String sql, Object[] param) {
		int count = super.executeSQL(sql, param);
		return count;
	}

}
