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
import cn.jbit.epetShop.dao.PetOwnerDao;
import cn.jbit.epetShop.entity.PetOwner;

/**
 * @author �������� �����������ݿ������
 */

public class PetOwnerDaoImpl extends BaseDao implements PetOwnerDao {
	private Connection conn = null; // �������ݿ�����

	private PreparedStatement pstmt = null; // ����ִ��SQL���

	private ResultSet rs = null; // �û������ѯ�����

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetOwnerDao#getAllOwner()
	 */
	public List<PetOwner> getAllOwner() {
		List<PetOwner> ownerList = new ArrayList<PetOwner>();
		String preparedSql = "select * from petowner ";
		rs = super.executeQuerySQL(preparedSql, null);
		try {
			while (rs.next()) {
				PetOwner petOwner = new PetOwner();
				petOwner.setId(rs.getInt(1));
				petOwner.setName(rs.getString(2));
				petOwner.setPassword(rs.getString(3));
				petOwner.setMoney(rs.getDouble(4));
				ownerList.add(petOwner);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return ownerList;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetOwnerDao#updateOwner(java.lang.String, java.lang.String[])
	 */
	public int updateOwner(String sql, String[] param) {
		int count = super.executeSQL(sql, param);
		return count;
	}

	/* (non-Javadoc)
	 * @see cn.jbit.epetShop.dao.impl.PetOwnerDao#selectOwner(java.lang.String, java.lang.String[])
	 */
	public PetOwner selectOwner(String sql, String[] param) {
		rs = super.executeQuerySQL(sql, param);
		PetOwner owner = null;
		try {
			while (rs.next()) {
				owner = new PetOwner();
				owner.setId(rs.getInt(1));
				owner.setName(rs.getString(2));
				owner.setPassword(rs.getString(3));
				owner.setMoney(rs.getDouble(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			super.closeAll(conn, pstmt, rs);
		}
		return owner;
	}

}