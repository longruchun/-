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
import cn.jbit.epetShop.dao.PetStoreDao;
import cn.jbit.epetShop.entity.PetStore;

/**
 * @author 北大青鸟 宠物商店数据库操作类
 */
public class PetStoreDaoImpl extends BaseDao implements PetStoreDao {
	private Connection conn = null; // 保存数据库连接

	private PreparedStatement pstmt = null; // 用于执行SQL语句

	private ResultSet rs = null; // 用户保存查询结果集

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetStoreDao#getAllStore()
	 */
	public List<PetStore> getAllStore() {
		List<PetStore> storeList = new ArrayList<PetStore>();
		String preparedSql = "select * from petstore ";
		rs = super.executeQuerySQL(preparedSql, null);
		try {
			while (rs.next()) {
				PetStore petStore = new PetStore();
				petStore.setId(rs.getInt(1));
				petStore.setName(rs.getString(2));
				petStore.setPassword(rs.getString(3));
				petStore.setBalance(rs.getDouble(4));
				storeList.add(petStore);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return storeList;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetStoreDao#getPetStore(java.lang.String, java.lang.String[])
	 */
	public PetStore getPetStore(String sql, String[] param) {
		rs = super.executeQuerySQL(sql, param);
		PetStore petStore = null;
		try {
			while (rs.next()) {
				petStore = new PetStore();
				petStore.setId(rs.getInt(1));
				petStore.setName(rs.getString(2));
				petStore.setPassword(rs.getString(3));
				petStore.setBalance(rs.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return petStore;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetStoreDao#updateStore(java.lang.String, java.lang.Object[])
	 */
	public int updateStore(String sql, Object[] param) {
		int count = super.executeSQL(sql, param);
		return count;
	}

}
