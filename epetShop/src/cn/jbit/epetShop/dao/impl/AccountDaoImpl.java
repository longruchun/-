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

import cn.jbit.epetShop.dao.AccountDao;
import cn.jbit.epetShop.dao.BaseDao;
import cn.jbit.epetShop.entity.Account;

/**
 * @author 北大青鸟 宠物商店台账信息数据库操作类
 */
public class AccountDaoImpl extends BaseDao implements AccountDao {
	private Connection conn = null; // 保存数据库连接

	private PreparedStatement pstmt = null; // 用于执行SQL语句

	private ResultSet rs = null; // 用户保存查询结果集

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.AccountDao#updateAccount(java.lang.String, java.lang.Object[])
	 */
	public int updateAccount(String sql, Object[] param) {
		int count = super.executeSQL(sql, param);
		return count;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.AccountDao#getPetStoreAccount(java.lang.String, java.lang.String[])
	 */
	public List<Account> getPetStoreAccount(String sql, String[] param) {
		rs = super.executeQuerySQL(sql, param);
		List<Account> accountList = new ArrayList<Account>();
		Account account = null;
		try {
			while (rs.next()) {
				account = new Account();
				account.setId(rs.getInt(1));
				account.setDealType(rs.getInt(2));
				account.setPetId(rs.getInt(3));
				account.setSellerId(rs.getInt(4));
				account.setBuyerId(rs.getInt(5));
				account.setPrice(rs.getDouble(6));
				account.setDealTime(rs.getDate(7));
				accountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return accountList;
	}
}
